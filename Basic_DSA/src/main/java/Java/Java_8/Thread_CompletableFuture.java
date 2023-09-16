package Java.Java_8;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Thread_CompletableFuture {
    private static Object object = new Object();

    private static IntPredicate oddCondition = num -> num % 2 != 0;
    private static IntPredicate evenCondition = num -> num % 2 == 0;

    public static void main(String[] args) {
        CompletableFuture.runAsync(()->Thread_CompletableFuture.printNumber(oddCondition));
        CompletableFuture.runAsync(()->Thread_CompletableFuture.printNumber(evenCondition));
    }
    public static void printNumber(IntPredicate condition){
        IntStream.rangeClosed(1,10).filter(condition).forEach(Thread_CompletableFuture::execute);
    }

    public static void execute(int num){
        synchronized (object) {
            System.out.println(Thread.currentThread().getName() + num);
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            object.notify();
        }
    }
}
