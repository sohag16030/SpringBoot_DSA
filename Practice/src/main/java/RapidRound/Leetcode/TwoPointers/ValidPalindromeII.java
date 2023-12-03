package RapidRound.Leetcode.TwoPointers;

public class ValidPalindromeII {
    public static void main(String[] args) {
        //String s = "abcddcmba";
        String s = "abmcddcba";
        validPalindrome(s);
    }

    public static boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0, h = chars.length - 1;
        while (l < h) {
            if (chars[l] != chars[h]) {
                boolean leftConsider = checkPalindrome(chars, l, h - 1);
                boolean rightConsider = checkPalindrome(chars, l + 1, h);
                if (leftConsider || rightConsider) return true;
                else return false;
            }
            l++;
            h--;
        }
        return true;
    }

    private static boolean checkPalindrome(char[] chars, int l, int h) {
        while (l < h) {
            if (chars[l] != chars[h])
                return false;
            l++;
            h--;
        }
        return true;
    }
}
