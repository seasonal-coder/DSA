class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //get the max kid and compare it
        int n = candies.length;
        int max = 0;
        for (int c : candies) if(c>max) max=c;
        
        List<Boolean> res = new ArrayList<>(n);
        for(int c : candies) res.add(c+extraCandies>=max);

        return res;
    }
}