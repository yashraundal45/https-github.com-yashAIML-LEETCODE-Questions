class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=2;i<=num;i++){
            int sum = 0;
            int store = i;
            while(store!=0){
                sum = sum + (store%10);
                store = store/10;
            }
            if(sum % 2 == 0) count++;
        } 
        return count;
    }


}