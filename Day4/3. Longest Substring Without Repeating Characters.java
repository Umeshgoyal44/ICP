class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        List<Character> lst= new ArrayList<>();
        int si=0 , ans =0;
        for(int e=0;e<n;e++){
            char c = s.charAt(e);
            while(lst.contains(c)){
                lst.remove(0);
                si++;
            }
            lst.add(c);
            ans=Math.max(ans,lst.size());

        }
        return ans;
    }
}
