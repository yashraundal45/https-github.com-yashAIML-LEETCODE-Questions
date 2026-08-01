class Solution {
    public int heightChecker(int[] heights) {
        int arr1[] = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for(int i=0;i<heights.length;i++){
            if(arr1[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}