class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> store = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            store.add(nums[i]);
        }

        for(int i=0;i<n;i++){
            store.add(nums[i]);
        }


        int arr1[] = new int[2*n];
        for(int i=0;i<(2*n);i++){
            arr1[i] = store.get(i);
        }

        return arr1;
    }
}