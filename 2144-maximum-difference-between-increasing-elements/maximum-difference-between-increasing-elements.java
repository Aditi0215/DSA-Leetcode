class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int x=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(x<nums[i])
            {
        max=Math.max(max,nums[i]-x);
            }
            else{
                x=nums[i];
            }
        }
        return max;
    }
}