package com.example.dsa.DSA.GraphPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class GraphImage {
    int v;
    LinkedList<Integer> adj[];
    GraphImage(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdges(int u, int v) {
        adj[u].add(v);
    }

    //DFS traverse
    public void DFS_Traverse(int s) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[v];
        stack.push(s);

        while (!stack.isEmpty()) {
            s = stack.pop();
            visited[s] = true;
            System.out.print("Parent::" + s + "-> ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    stack.push(n);
                    //System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}

public class DFS_PracticeAdjList {
    public static void main(String[] args) {
        GraphImage graphImage = new GraphImage(5);
        graphImage.addEdges(1,2);
        graphImage.addEdges(1,3);
        graphImage.addEdges(2,4);
        graphImage.DFS_Traverse(1);
    }
}
