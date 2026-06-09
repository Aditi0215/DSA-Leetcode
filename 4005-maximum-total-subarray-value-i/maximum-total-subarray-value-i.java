class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];

        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }

        return 1L*k*(max-min);
    }
}