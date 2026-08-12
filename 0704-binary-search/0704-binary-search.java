class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int idx = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(target == nums[mid]){
                idx = mid;
                break;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return idx;
    }
}