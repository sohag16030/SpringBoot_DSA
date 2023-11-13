package TopicWisePreparation.F.Heap_PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));

    }
    public static  int lastStoneWeight(int[] stones) {
        Comparator descComparator = Comparator.reverseOrder();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(descComparator);
        for(int val : stones){
            priorityQueue.add(val);
        }
        while (priorityQueue.size() > 1) {
            int f = priorityQueue.peek();
            priorityQueue.poll();
            int s = priorityQueue.peek();
            priorityQueue.poll();
            priorityQueue.add(Math.abs(f - s));
        }
        System.out.println(priorityQueue.peek());
        return priorityQueue.peek();
    }
}
