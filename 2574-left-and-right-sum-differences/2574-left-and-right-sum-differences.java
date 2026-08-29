class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalRight = 0;
        for(int num : nums) {
            totalRight += num;
        }
        
        int leftSum = 0;
        int n = nums.length;
        int[] result = new int[n];
        
        for(int i = 0; i < n; i++) {
            totalRight -= nums[i];
            result[i] = Math.abs(leftSum - totalRight);
            leftSum += nums[i];
        }  
        return result;
    }
}
