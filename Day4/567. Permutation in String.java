class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char [] arr=s1.toCharArray();
        Arrays.sort(arr);
        String sort1=new String (arr);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String sub=s2.substring(i,i+s1.length());
            char [] arr2=sub.toCharArray();
            Arrays.sort(arr2);
            if(sort1.equals(new String(arr2))){
                return true;
            }
        }
        return false;
    }
}
