class Solution{
    public List<Integer> findMissingElements(int[] nums){
        ArrayList<Integer>store=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int num=nums[i]+1;
            while(num<nums[i+1]){
                store.add(num);
                num++;
            }
        }
        return store;
    }
}