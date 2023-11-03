package TopicWisePreparation.b.SlidingWindow;

public class RerverseWordInAString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] strArr = s.split(" ");
        String result = "";
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
            StringBuilder str = new StringBuilder(strArr[i]).reverse();
            if (i < strArr.length - 1)
                result += str + " ";
            else result += str;
        }

        return result;
    }
}
