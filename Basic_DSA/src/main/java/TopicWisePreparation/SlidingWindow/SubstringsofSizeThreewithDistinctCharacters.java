package TopicWisePreparation.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class SubstringsofSizeThreewithDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int asn = countGoodSubstrings(s);
    }

    public static int countGoodSubstrings(String s) {
        int count = 0, i = 0;
        while (i <= s.length() - 3) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i + 2) && s.charAt(i) != s.charAt(i + 2)) {
                count++;
                //System.out.println(i);
                i++;
            } else if (s.charAt(i + 1) != s.charAt(i + 2)) i++;
            else i += 2;
        }
        return count;
    }
}
