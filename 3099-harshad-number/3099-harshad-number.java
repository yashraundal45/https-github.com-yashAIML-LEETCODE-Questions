class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int store = x;
        int sod = 0;
        while(x != 0 ){
            sod = sod + (x%10);
            x = x/10;
        }
        if(store % sod == 0) return sod;
        else{
            return -1;
        }
    }
}