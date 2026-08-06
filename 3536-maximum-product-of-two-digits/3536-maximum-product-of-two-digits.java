class Solution {
    public int maxProduct(int n) {
        int s = n;
        ArrayList<Integer> store = new ArrayList<>();
        while(n!=0){
            int ld = n % 10;
            store.add(ld);
            n = n/10;
        }
        Collections.sort(store);
        int max1 = store.get(store.size() - 1);
        int max2 = store.get(store.size() -2);
        return max1 * max2;
    }
}