class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> store = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !store.contains(nums1[i])) {
                    store.add(nums1[i]);
                    break;
                }
            }
        }

        int[] ans = new int[store.size()];

        for (int i = 0; i < store.size(); i++) {
            ans[i] = store.get(i);
        }

        return ans;
    }
}