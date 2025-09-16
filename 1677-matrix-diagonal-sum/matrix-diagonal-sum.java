class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        
        if(n == 1) return mat[0][0];
        int sum = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1){
                    sum = sum+mat[i][j];
                }
            }
        }    
        return sum;
        
    }
}