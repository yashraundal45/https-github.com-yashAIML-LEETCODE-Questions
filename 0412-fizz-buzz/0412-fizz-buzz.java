class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> store  = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i % 3 == 0 || i % 5 == 0){
                if(i % 3 == 0 && i % 5 ==0){
                    store.add("FizzBuzz");
                }
                else if(i % 3 == 0){
                    store.add("Fizz");
                }
                else if(i % 5 == 0){
                    store.add("Buzz");
                }
            }
            else{
                String text = String.valueOf(i);
                store.add(text);
            }
        }
        return store;
    }
}