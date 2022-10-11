package Arrays;

public class RotateImage {
    //Rotate Groups of Four Cells

    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < (n + 1) / 2; i ++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                    matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                    matrix[j][n - 1 - i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }
    }
//    Complexity Analysis
//
//    Let M be the number of cells in the matrix.
//
//    Time complexity :O(M), as each cell is getting read once and written once.
//
//    Space complexity:O(1) because we do not use any other additional data structures.

    //Reverse on Diagonal and then Reverse Left to Right
    class Solution2 {
        public void rotate(int[][] matrix) {
            transpose(matrix);
            reflect(matrix);
        }

        public void transpose(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int tmp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = tmp;
                }
            }
        }

        public void reflect(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - j - 1];
                    matrix[i][n - j - 1] = tmp;
                }
            }
        }
    }


//    Complexity Analysis
//
//    Let M be the number of cells in the grid.
//
//    Time complexity : O(M). We perform two steps; transposing the matrix, and then reversing each row.
//    Transposing the matrix has a cost of O(M) because we're moving the value of each cell once.
//    Reversing each row also has a cost of O(M), because again we're moving the value of each cell once.
//
//    Space complexity : O(1) because we do not use any other additional data structures.


}
