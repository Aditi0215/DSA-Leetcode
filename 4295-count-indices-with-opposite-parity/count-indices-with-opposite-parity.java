class Solution {
    public int[] countOppositeParity(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count = 0;
            if(nums[i]%2!=0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2==0)
                        count++;
                }
            nums[i] = count;
            }
            else{
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2!=0)
                        count++;
                }
            nums[i] = count;
            }
        }
        return nums;
    }
}