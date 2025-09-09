class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0, max = 0;
        for (int g : gain){
            alt = alt +g;

            if (alt>max) max = alt;       
        }
        
        return max;
    }
}