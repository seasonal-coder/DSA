class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0; 
        int end = nums.length-1;
        int temp;
        while(start<=end){
            if(nums[start]%2==0){
                start=start+1;
            }
            else if(nums[end]%2!=0){
                end = end -1;

            }
            else{
                temp = nums[start];
                nums[start] = nums[end];
                nums[end]= temp;

                start = start+1;
                end = end-1;   
            }
        }
        return nums;
        
    }
}