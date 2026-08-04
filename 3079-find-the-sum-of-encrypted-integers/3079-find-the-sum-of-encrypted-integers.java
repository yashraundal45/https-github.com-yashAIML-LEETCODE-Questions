class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int temp =num, max = 0, digits = 0;
            while (temp> 0) {
                if (temp% 10 > max)
                    max = temp % 10;
                temp /= 10;
                digits++;
            }
            int encrypt = 0;
            while (digits> 0) {
                encrypt = encrypt*10 + max;
                digits--;
            }
            sum +=encrypt;
        }
        return sum;
    }
}