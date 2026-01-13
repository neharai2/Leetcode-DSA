class Solution {
    public void setZeroes(int[][] matrix) {
        
         int ROWS = matrix.length;
        int COLUMNS = matrix[0].length;

        boolean rowZero = false;

        // First pass: mark rows and columns
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    if (i == 0) {
                        rowZero = true;
                    } else {
                        matrix[i][0] = 0;
                    }
                }
            }
        }

        // Second pass: zero inner matrix
        for (int i = 1; i < ROWS; i++) {
            for (int j = 1; j < COLUMNS; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Handle first column
        if (matrix[0][0] == 0) {
            for (int i = 0; i < ROWS; i++) {
                matrix[i][0] = 0;
            }
        }

        // Handle first row
        if (rowZero) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}