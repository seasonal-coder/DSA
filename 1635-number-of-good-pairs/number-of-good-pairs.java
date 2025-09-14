class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int counter = 1;
        int pairs = 0;
        for (int i =1; i<n; i++){
            if(nums[i]==nums[i-1]){
                counter++;
            }
            else{
                pairs += counter * (counter - 1) / 2;

                counter = 1;

            }
        }
        pairs += counter * (counter - 1) / 2;
        return pairs;
    }
}