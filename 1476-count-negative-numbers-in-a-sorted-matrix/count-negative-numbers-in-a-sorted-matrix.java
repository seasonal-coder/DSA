class Solution {
    public int countNegatives(int[][] grid) {
        int counter =0;
        for(int[] rows : grid ){
            for(int element : rows){
                if (element<0){
                    counter++;
                }
            }
        }
        return counter;
        
    }
}