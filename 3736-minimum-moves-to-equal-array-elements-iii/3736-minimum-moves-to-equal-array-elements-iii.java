class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i] < nums[n-1]){
                while(nums[i] != nums[n-1]){
                    nums[i]++;
                    count++;
                }
            }
        }
        return count;
    }
}