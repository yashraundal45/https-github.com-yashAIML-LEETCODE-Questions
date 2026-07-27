class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int n1 = nums[n-1];
        int n2 = nums[n-2];
        int ans = (n1-1) * (n2-1);
        return ans;
    }
}