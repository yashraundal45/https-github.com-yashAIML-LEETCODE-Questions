class Solution {
    public boolean isSameAfterReversals(int num) {
        int store = num;

        int reverse = 0;
        while(num != 0){
            reverse  = reverse * 10 + (num % 10);
            num = num /10;
        }

        int reverse2  = 0;
        while(reverse != 0){
            reverse2  = reverse2 * 10 + (reverse % 10);
            reverse = reverse /10;
        }
        
        if(store == reverse2) return true;
        else{
            return false;
        }
    }
}