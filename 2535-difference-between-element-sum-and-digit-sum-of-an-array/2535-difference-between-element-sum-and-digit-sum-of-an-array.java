class Solution {
    public int differenceOfSum(int[] nums) {
        int Esum  = 0;
        int Dsum = 0;
        for(int i=0;i<nums.length;i++){
            Esum = Esum + nums[i];
            
            int currEsum = 0;
            while(nums[i] !=0){
                currEsum = currEsum + (nums[i]%10);
                nums[i] = nums[i]/10;
            }
            Dsum = Dsum + currEsum;
        }
        int ans = Math.abs(Esum - Dsum);
        return ans;
    }
}