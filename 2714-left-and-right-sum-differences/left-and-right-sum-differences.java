class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        int ans[] = new int[nums.length];
        

        int sum1 = 0;
        for(int i=1;i<nums.length;i++){
            sum1 = sum1+nums[i-1];
            leftSum[i] = sum1;
        }

        int sum2 = 0;
        for(int i=nums.length-2;i>=0;i--){
            sum2 = sum2+nums[i+1];
            rightSum[i] = sum2;
        } 

        for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;       
    }
}