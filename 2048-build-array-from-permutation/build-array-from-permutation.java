class Solution {
    public int[] buildArray(int[] nums) {
        int n =  nums.length;
        int ans[] = new int[n];

        for(int i=0;i<ans.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}