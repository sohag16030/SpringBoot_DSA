package WellInterview.Heap_PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        Comparator descComparator = Comparator.reverseOrder();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(descComparator);
        priorityQueue.add(2);
        priorityQueue.add(7);
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(1);

        while (priorityQueue.size() > 1) {
            int f = priorityQueue.peek();
            priorityQueue.poll();
            int s = priorityQueue.peek();
            priorityQueue.poll();
            priorityQueue.add(Math.abs(f - s));
        }
        System.out.println(priorityQueue.peek());
    }
}
