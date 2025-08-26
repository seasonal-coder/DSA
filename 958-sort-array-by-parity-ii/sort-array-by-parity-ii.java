class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = 0, odd = 1;

        while (even < n && odd < n) {
            if (nums[even] % 2 == 0) {
                even += 2;   // correct at even index
            } else if (nums[odd] % 2 == 1) {
                odd += 2;    // correct at odd index
            } else {
                // mismatch: odd at even index, even at odd index → swap
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd += 2;
            }
        }
        return nums;
    }
}
