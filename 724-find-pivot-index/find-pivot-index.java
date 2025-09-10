class Solution {
    public int pivotIndex(int[] nums) {
        //total = left+nums[i]+right
        // at pivot nums[i] = pivot, left = right
        //total = left + nums[i] + left
        //total == 2*left+nums[i]; return i;

        int left = 0, total = 0;
        for (int num : nums){
            total += num; 
        }
        for (int i=0; i<nums.length; i++){
            if(left*2 + nums[i] == total){
                return i;
            }
            left += nums[i];
        }
        return -1;
        
    }
}