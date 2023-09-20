package com.example.dsa.DSA.GraphPractice;

import java.util.LinkedList;

class GraphDFSRecursive {
    int v;
    LinkedList<Integer> adj[];
    boolean[] visited;

    GraphDFSRecursive(int v) {
        this.v = v;
        visited = new boolean[v];
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public void DFS_Recursive(int s) {
        if (!visited[s]) {
            visited[s] = true;
            System.out.println(s);
            for (int v : adj[s]) {
                DFS_Recursive(v);
            }
        }
    }
}

public class DFS_RecursiveAdjList {
    public static void main(String[] args) {
        GraphDFSRecursive g = new GraphDFSRecursive(8);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 6);
        g.addEdge(6, 7);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.DFS_Recursive(0);
    }
}
