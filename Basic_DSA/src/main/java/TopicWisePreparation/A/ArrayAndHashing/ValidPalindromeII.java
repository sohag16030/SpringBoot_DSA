package TopicWisePreparation.A.ArrayAndHashing;

public class ValidPalindromeII {
    public static void main(String[] args) {
        //String s = "ebcbb ececabbace c bbcbe";
        String s = "ebcbbececabbacecbbcbe";
        validPalindrome(s);
    }

    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int itr = 1, l;
        boolean used = false;
        if (s.length() % 2 == 0) l = s.length() / 2;
        else l = s.length() / 2 + 1;
        boolean flag = true;
        while (itr <= l) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if (s.charAt(i) != s.charAt(j) && !used) {
                if (s.charAt(i) == s.charAt(j - 1)) {
                    used = true;
                    j--;
                } else if (s.charAt(i + 1) == s.charAt(j)) {
                    used = true;
                    i++;
                } else used = true;
            } else {
                flag = false;
                break;
            }
            itr++;
        }
        if (!flag) {
            int m = 0, n = s.length() - 1;
            int itr2 = 1;
            boolean used2 = false;
            while (itr2 <= l) {
                if (s.charAt(m) == s.charAt(n)) {
                    m++;
                    n--;
                } else if (s.charAt(m) != s.charAt(n) && !used2) {
                    if (s.charAt(m + 1) == s.charAt(n)) {
                        used2 = true;
                        m++;
                    } else if (s.charAt(m) == s.charAt(n - 1)) {
                        used2 = true;
                        n--;
                    } else used2 = true;
                } else {
                    return false;
                }
                itr2++;
            }
        }
        return true;
    }
}
