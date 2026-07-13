class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumAlice = 0;
        int sumBob = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 10) {
                sumAlice += nums[i];
            } else {
                sumBob += nums[i];
            }
        }

        return sumAlice != sumBob;
    }
}