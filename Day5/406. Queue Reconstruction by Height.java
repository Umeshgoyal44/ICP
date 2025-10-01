class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        List<int[]> lst=new ArrayList<>();
        for(int i=0;i<people.length;i++){
            int[] person=people[i];
            lst.add(person[1],person);
        }
        return lst.toArray(new int[people.length][2]);
    }
}
