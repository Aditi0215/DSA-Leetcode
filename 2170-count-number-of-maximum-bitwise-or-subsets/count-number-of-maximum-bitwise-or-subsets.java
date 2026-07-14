class Solution {

    int maxOR = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {

        // Find the maximum possible OR
        for (int num : nums) {
            maxOR |= num;
        }

        dfs(nums, 0, 0);

        return count;
    }

    private void dfs(int[] nums, int index, int currentOR) {

        if (index == nums.length) {
            if (currentOR == maxOR) {
                count++;
            }
            return;
        }

        // Include current element
        dfs(nums, index + 1, currentOR | nums[index]);

        // Exclude current element
        dfs(nums, index + 1, currentOR);
    }
}