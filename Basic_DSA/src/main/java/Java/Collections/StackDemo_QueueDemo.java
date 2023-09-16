package Java.Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackDemo_QueueDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(100);
        stack.push(12);
        stack.pop();
        //System.out.println(stack.peek());
        stack.push(102);
        //System.out.println(stack.peek());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
    }
}
