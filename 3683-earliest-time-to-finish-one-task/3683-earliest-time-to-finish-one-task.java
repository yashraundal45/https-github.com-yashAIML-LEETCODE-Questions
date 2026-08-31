class Solution {
    public int earliestTime(int[][] tasks) {
        int maxSum = tasks[0][0] + tasks[0][1];
       for(int i=0;i<tasks.length;i++){
        int sum = 0;
        for(int j=0;j<2;j++){
           sum = sum + tasks[i][j]; 
        }
        maxSum = Math.min(maxSum,sum);
       } 
       return maxSum;
    }
}