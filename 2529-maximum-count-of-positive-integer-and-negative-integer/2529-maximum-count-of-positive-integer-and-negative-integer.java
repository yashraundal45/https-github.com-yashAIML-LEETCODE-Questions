class Solution {
    public int maximumCount(int[] nums) {
        int ncount = 0;
        int pcount = 0;
        int zcount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0) ncount++;
            else if(nums[i] > 0) pcount++;
            else zcount++;
        }
        return Math.max(ncount,pcount);
    }
}