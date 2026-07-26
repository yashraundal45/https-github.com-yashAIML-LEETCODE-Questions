class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int n1 = nums[n-1];
        int n2 = nums[n-2];
        int n3 = nums[n-3];
        int b = nums[0] * nums[1] * nums[n - 1];
        int a = n1*n2*n3;

        int ans = Math.max(a,b);
        return ans;        
    }
}