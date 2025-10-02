class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0;
        int e=0;
        int zero=0;
        int ans=0;
        int maxlen=0;
        while(e<nums.length){
            if(nums[e]==0){
                zero++;
            }
            while(zero>k){
                if(nums[s]==0){
                    zero--;
                }
                s++;
            }
            if(zero<=k){
                maxlen=e-s+1;
                ans=Math.max(ans,maxlen);
            }
            e++;
        }
        return ans;
    }
}
