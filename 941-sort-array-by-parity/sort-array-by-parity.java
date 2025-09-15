class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l =0, r= nums.length-1;
        int temp =0;
        while(l<=r){
            if(nums[l]%2==0 ) l++;
            else if(nums[r]%2!=0) r--;
            else{
                
                temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
            

        }
        return nums;
        
    }
}