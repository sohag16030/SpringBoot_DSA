package com.example.dsa.DSA.GraphPractice;

import java.util.LinkedList;
import java.util.Queue;

class Graph {
    int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdges(int u, int v) {
        adj[u].add(v);
    }

    public void BFS_Traverse(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.println("source" + u);
            for (int v : adj[u]) {
                if (!visited[v]) {
                    System.out.println("adjacent:" + v);
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }
}

public class GraphConstructionBFSAdjList {
    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.addEdges(0, 1);
        graph.addEdges(0, 2);
        System.out.println("BFS Traverse");
        graph.BFS_Traverse(0);
    }
}
