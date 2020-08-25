class Solution {
    public boolean canJump(int[] nums) {
        int lastValidPosition = nums.length -1;
        for(int i=nums.length-1; i>=0; i--) {
            if(i+nums[i] >= lastValidPosition) {
                lastValidPosition = i; // 0
            }
        }
        return lastValidPosition == 0;
    }
}
