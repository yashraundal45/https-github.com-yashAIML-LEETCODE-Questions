class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            while(nums[i] != 0){
                int ld = nums[i] %10;
                if(ld == digit){
                    count++;
                }
                nums[i] = nums[i]/10;
            }
        }   
        return count;
    }
}