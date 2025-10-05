class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int pro=0;
        int t=0;
        for(int money: nums){
            int temp=t;
            t=Math.max(t,pro+money);
            pro=temp;
        }
        return t;
    }
}
