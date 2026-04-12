class Solution {

    // Get position of character (row, col)
    private int[] getPos(char c) {
        int index = c - 'A';
        return new int[]{index / 6, index % 6};
    }

    // Manhattan distance
    private int dist(char a, char b) {
        if (a == 0) return 0; // finger not used yet
        int[] p1 = getPos(a);
        int[] p2 = getPos(b);
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    public int minimumDistance(String word) {
        int n = word.length();
        int[][] dp = new int[n][27];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 27; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        // First character
        dp[0][26] = 0; // 26 means "no finger placed"

        for (int i = 1; i < n; i++) {
            char curr = word.charAt(i);
            char prev = word.charAt(i - 1);

            for (int j = 0; j <= 26; j++) {
                if (dp[i - 1][j] == Integer.MAX_VALUE) continue;

                // Case 1: move same finger
                dp[i][j] = Math.min(
                    dp[i][j],
                    dp[i - 1][j] + dist(prev, curr)
                );

                // Case 2: move other finger
                dp[i][prev - 'A'] = Math.min(
                    dp[i][prev - 'A'],
                    dp[i - 1][j] + dist((char)(j == 26 ? 0 : (j + 'A')), curr)
                );
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= 26; j++) {
            ans = Math.min(ans, dp[n - 1][j]);
        }

        return ans;
    }
}