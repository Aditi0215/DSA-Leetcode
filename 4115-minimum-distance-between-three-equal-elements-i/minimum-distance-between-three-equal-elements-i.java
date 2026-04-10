class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums[i] == nums[k]) {
                            int dist = Math.abs(i - j) 
                                     + Math.abs(j - k) 
                                     + Math.abs(k - i);
                            minDist = Math.min(minDist, dist);
                        }
                    }
                }
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}