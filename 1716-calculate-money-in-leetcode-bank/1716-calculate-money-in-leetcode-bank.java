class Solution {
    public int totalMoney(int days) {
        int sum= 0;
        int start =  1;
        for (int i = 0;i< days; i++) {
            int offset = i % 7;
            if (i > 0 &&offset == 0) {
                start++;
            }
            sum += start+ offset;
        }
        return sum;
    }
}
