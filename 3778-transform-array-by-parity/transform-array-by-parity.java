class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}