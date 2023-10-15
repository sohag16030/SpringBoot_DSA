package WellInterview.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String  s = "A man, a plan, a canal: Panama" ;
        String updatedString = s.replaceAll("[^a-zA-Z]","").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(updatedString);
        String reverseString =  stringBuilder.reverse().toString();

        System.out.println(updatedString.equals(reverseString) ? true: false);
    }
}
