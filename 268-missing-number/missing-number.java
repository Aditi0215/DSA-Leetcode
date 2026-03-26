class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        /*int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }*/
        if(nums[0]!=0) return 0;
       for(int i=0;i<nums.length-1;i++)
       {
          if(nums[i+1]-nums[i]==1||nums[i+1]==nums[i])
          {
            continue;
          }
          else
          {
            return nums[i]+1;
          }
       }
       return nums.length;
    }
}