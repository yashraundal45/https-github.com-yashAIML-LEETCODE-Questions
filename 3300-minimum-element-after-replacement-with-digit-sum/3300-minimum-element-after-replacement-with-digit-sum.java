class Solution {
    public int minElement(int[] nums) {
        int minResult = Integer.MAX_VALUE;        
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int store = nums[i];     
            while (store > 0) {
                int ld = store % 10;
                sum = sum + ld;
                store = store / 10;
            }            
            minResult = Math.min(minResult, sum); 
        }      
        return minResult;
    }
}
