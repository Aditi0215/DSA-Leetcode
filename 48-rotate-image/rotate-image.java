class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length-1;

        int ans[][] = new int[matrix.length] [matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                ans[j][m] = matrix[i][j];
            }
            m--;
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}