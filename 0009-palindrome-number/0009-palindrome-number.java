class Solution {
    public boolean isPalindrome(int x) {
        int xcopy =x;
        int reve = 0;

        // Reverse number
        while (x > 0) {
            int digit = x % 10;
            reve = reve * 10 + digit;
            x = x / 10;
        }

        // Return result instead of printing here
        return xcopy == reve;
    }
}