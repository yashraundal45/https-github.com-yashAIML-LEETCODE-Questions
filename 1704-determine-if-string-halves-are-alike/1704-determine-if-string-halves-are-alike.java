class Solution {
    public boolean halvesAreAlike(String s) {
        String a = "aeiouAEIOU";
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            for (int j = 0; j < a.length(); j++) {
                if (s.charAt(i) == a.charAt(j)) {
                    count1++;
                }
            }
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (s.charAt(i) == a.charAt(j)) {
                    count2++;
                }
            }
        }

        return count1 == count2;
    }
}