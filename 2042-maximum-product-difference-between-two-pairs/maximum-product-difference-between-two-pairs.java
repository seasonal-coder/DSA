class Solution {
    public int maxProductDifference(int[] nums) {

        // the difference will be high when the subtraction happens from higher prodduct to lower product, no negative elements so lessgo
        // just sort and do the subtraction between product of last two to product of first two

        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[n-1]*nums[n-2] - nums[0]*nums[1];
        return ans;
        
    }
}