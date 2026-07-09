class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k-- >0){
            int minIndex = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<nums[minIndex]){
                    minIndex = i;
                }
            }
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}