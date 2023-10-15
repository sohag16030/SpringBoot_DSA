package com.example.dsa.DSA;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert elements with priorities
        pq.offer(5);    // Insert 5 with priority 5
        pq.offer(2);    // Insert 2 with priority 2
        pq.offer(8);    // Insert 8 with priority 8
        pq.offer(3);    // Insert 1 with priority 1

        // Peek at the element with the highest priority (without removing it)
        int highestPriorityElement = pq.peek();
        System.out.println("Element with highest priority: " + highestPriorityElement);

        // Remove and retrieve elements in priority order
        while (!pq.isEmpty()) {
            int element = pq.poll();
            System.out.println("Removed: " + element);
        }
    }
}
