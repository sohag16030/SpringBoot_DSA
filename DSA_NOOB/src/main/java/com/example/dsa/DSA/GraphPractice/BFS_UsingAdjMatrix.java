package com.example.dsa.DSA.GraphPractice;

import java.util.ArrayList;
import java.util.List;

class GraphBFSAdjMarix {
    int v;
    private int[][] adj;

    GraphBFSAdjMarix(int v) {
        this.v = v;
        adj = new int[v][v];
        for (int i = 0; i < v; i++) {
            adj[i] = new int[v];
        }
    }

    public void addEdge(int u, int v) {
        adj[u][v] = 1;
    }

    //Traverse
    public void bfsTraverse(int s) {
        boolean[] visited = new boolean[v];
        List<Integer> queue = new ArrayList<Integer>();
        queue.add(s);
        while (!queue.isEmpty()) {
            s = queue.get(0);
            System.out.print("Source::"+ s +"-> ");
            visited[s] = true;
            for (int k = 0; k < adj[s].length; k++) {
                if (adj[s][k] == 1 && !visited[k]) {
                    queue.add(k);
                    visited[k] = true;
                }
            }
        }
    }
}

public class BFS_UsingAdjMatrix {
    public static void main(String[] args) {
        System.out.println("BFS Using adjacency matrix:::");

    }
}
