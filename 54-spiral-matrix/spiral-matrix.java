class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (true) {
            // left -> right on top row
            for (int j = left; j <= right; j++) res.add(matrix[top][j]);
            top++;
            if (top > bottom) break;

            // top -> bottom on right column
            for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;
            if (left > right) break;

            // right -> left on bottom row
            for (int j = right; j >= left; j--) res.add(matrix[bottom][j]);
            bottom--;
            if (top > bottom) break;

            // bottom -> top on left column
            for (int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
            if (left > right) break;
        }

        return res;
    }
}
