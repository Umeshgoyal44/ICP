class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> result = new ArrayList<>();
        getCombinations(result, candidates, target, 0, new ArrayList<>());
        return result;
    }

    public void getCombinations(List<List<Integer>> result, int[] candidates, int target, int index,
            List<Integer> temp) {
        if (target < 0)
            return;
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target)
                break;
            
            temp.add(candidates[i]);
            
            getCombinations(result, candidates, target - candidates[i], i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
