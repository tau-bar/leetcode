class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int oldRows = mat.length;
        int oldCols = mat[0].length;
        if (oldCols == c && oldRows == r) {
            return mat;
        }  else if (oldCols * oldRows == r * c) {
            int colPointer = 0;
            int rowPointer = 0;
            int[][] newMat = new int[r][c];
            for (int i = 0; i < oldRows; i++) {
                for (int j = 0; j < oldCols; j++) {
                    if (colPointer == 0) {
                        newMat[rowPointer] = new int[c];
                    }
                    if (colPointer < c) {
                        newMat[rowPointer][colPointer] = mat[i][j];
                        colPointer++;
                    } else {
                        colPointer = 1;
                        rowPointer++;
                        newMat[rowPointer] = new int[c];
                        newMat[rowPointer][0] = mat[i][j];
                    }
                }
            }
            return newMat;

        } else {
            return mat;
        }
    }
}