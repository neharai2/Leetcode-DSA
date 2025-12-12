class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;         // number of rows
        int n = matrix[0].length;      // number of columns

        int start = 0;                 // row index
        int end = n - 1;               // column index

        
        while (start < m && end >= 0) {

            
            if (matrix[start][end] == target) {
                return true;
            }
            else if (matrix[start][end] > target) {
                end--;     // move left
            }
            else {
                start++;   // move down
            }
        }

        return false;
    }
}