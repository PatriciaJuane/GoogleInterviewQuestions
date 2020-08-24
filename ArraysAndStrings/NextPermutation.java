class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i>=0 && nums[i+1] <= nums[i]) {
            i--;
        }
        
        if(i>=0) {
            int j = nums.length - 1;
            while(j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i]; // swap i and j
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums,i+1); // elements after i sorted in ascending order
    }
    
    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

}