import java.util.Arrays;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len = matrix.length;
        int[] arr = new int[len * len];
        int pos = 0;
        
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < len; c++) {
                arr[pos++] = matrix[r][c];
            }
        } 
        Arrays.sort(arr);
        return arr[k-1];
    }
}
