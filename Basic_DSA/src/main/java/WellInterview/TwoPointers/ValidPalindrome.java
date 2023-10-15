package WellInterview.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String updatedString = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] update = updatedString.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder(updatedString);
//        String reverseString =  stringBuilder.reverse().toString();
//
//        System.out.println(updatedString.equals(reverseString) ? true: false);

        //using two pointer approach
        int l = 0;
        int h = update.length - 1;
        while (l < update.length / 2) {
            if (update[l] != update[h])
                System.out.println("false");
            else {
                l++;
                h--;
            }
        }

    }
}
