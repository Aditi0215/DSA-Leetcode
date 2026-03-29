class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // if current index is not reachable
            if (i > maxReach) {
                return false;
            }

            // update max reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}