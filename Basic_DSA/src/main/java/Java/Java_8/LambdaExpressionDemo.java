package Java.Java_8;

@FunctionalInterface

// one abstract method is called functional interface.. prerequisite........
interface MyFunction {
   // int testMethod(int i);
    void test(String str1,String str2);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Runnable Interface");
//            }
//        };
//         Runnable runnable =()->{
//             System.out.println("Runnable Interface with lambda Expression");
//         };
//        Thread th = new Thread(runnable);
//        th.start();

//        MyFunction myFunction = (i) -> i * 10;
//        System.out.println(myFunction.test(15));

       MyFunction myFunction = (str1,str2)->{
            System.out.println(str1 + " "+str2);
        };
       myFunction.test("Hello" ,"world");
    }
}
