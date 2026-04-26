class Solution {
    int m, n;
    boolean[][] visited;

    public boolean containsCycle(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j]){
                    if(dfs(grid, i, j, -1, -1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] grid, int i, int j, int pi, int pj){
        visited[i][j] = true;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        for(int d = 0; d < 4; d++){
            int ni = i + dx[d];
            int nj = j + dy[d];

            if(ni < 0 || nj < 0 || ni >= m || nj >= n) continue;
            if(grid[ni][nj] != grid[i][j]) continue;

            if(!visited[ni][nj]){
                if(dfs(grid, ni, nj, i, j)) return true;
            }
            else if(ni != pi || nj != pj){
                return true; // cycle found
            }
        }
        return false;
    }
}