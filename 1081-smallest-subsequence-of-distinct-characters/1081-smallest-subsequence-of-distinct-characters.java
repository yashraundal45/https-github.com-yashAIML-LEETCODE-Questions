class Solution {
    public String smallestSubsequence(String s) {
        int[] count = new int[26];
        boolean[] used = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            count[ch - 'a']--;

            if (used[ch - 'a']) {
                continue;
            }

            while (!stack.isEmpty() &&
                   ch < stack.peek() &&
                   count[stack.peek() - 'a'] > 0) {

                used[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            used[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }
}