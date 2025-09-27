class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length-k+1];
        int p=0;
        Deque<Integer> deq = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.pollFirst();
            }
            while(!deq.isEmpty() && nums[i]>=nums[deq.peekLast()]){
                deq.pollLast();
            }
            deq.offerLast(i);
            if(i>=k-1){ 
                ans[p++]=nums[deq.peekFirst()];
            }
        }
        return ans; 
    }
}
