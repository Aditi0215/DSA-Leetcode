class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col >=0){
            int curr = matrix[row][col];

            if(target == curr){
                return true;
            }
            else if(target<curr){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}