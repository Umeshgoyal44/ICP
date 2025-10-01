class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] arr=p.toCharArray();
        Arrays.sort(arr);
        String sorted=new String(arr);
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            String sub=s.substring(i,i+p.length());
            char[] arr2=sub.toCharArray();
            Arrays.sort(arr2);
            if(sorted.equals(new String(arr2))){
                lst.add(i);
            }
        }
        return lst;

    }
}
