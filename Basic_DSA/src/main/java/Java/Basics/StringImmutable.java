package Java.Basics;

public class StringImmutable {
    public static void main(String[] args) {
        String str = new String("Hello");
        str.concat("world");
        System.out.println(str);
       // System.out.println(str2);
    }
}
