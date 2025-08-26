class Solution {
    public void sortColors(int[] nums) {
        int[] freqCounter=new int[3];
        
        for(int i = 0; i<nums.length;i++){
            freqCounter[nums[i]]++;
        } 
        int pos=0;
        for(int color = 0; color<3; color++){
            for(int i=0; i<freqCounter[color];i++){
                nums[pos] = color;
                pos++;
            }
        }

        
    }
}