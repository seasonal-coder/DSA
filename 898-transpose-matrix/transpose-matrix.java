class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] res = new int [matrix[0].length][matrix.length];
        for(int c=0; c<matrix[0].length; c++){
            for(int r=0; r<matrix.length; r++){
                res[c][r] = matrix[r][c];
            }
        }
        return res;

        
    }
}