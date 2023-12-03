package RapidRound.Leetcode.ArrayHashing;

import java.util.Arrays;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        String finalRes = "";
        for (int i = 0; i < strings.length - 1; i++) {
            String reverse = reverStringCharacter(strings[i]);
            finalRes += reverse + " ";
        }
        String reverse = reverStringCharacter(strings[strings.length - 1]);
        finalRes += reverse;
        return finalRes;
    }

    private static String reverStringCharacter(String str) {
        int l = 0, h = str.length() - 1, itr = 0;
        char[] strChars = str.toCharArray();
        while (itr < strChars.length / 2) {
            char temp = strChars[l];
            strChars[l] = strChars[h];
            strChars[h] = temp;
            l++;
            h--;
            itr++;
        }
        String revStr = "";
        for (char c : strChars) revStr += c;
        return revStr;
    }
}
