package DSA.Graph_;

import java.util.Iterator;
import java.util.LinkedList;

import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer>[] adj;

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

    public void BFS(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");

            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }
}

public class GraphConstructionBFSAdjList {
    public static void main(String[] args) {
        Graph graph = new Graph(7); // Update the number of vertices to 7
        graph.addEdges(0, 1);
        graph.addEdges(0, 2);
        graph.addEdges(1, 3);
        graph.addEdges(1, 4);
        graph.addEdges(4, 5);
        graph.addEdges(4, 6); // Corrected the vertex number to 6 (instead of 7)
        System.out.println("BFS Traverse");
        graph.BFS(0);
    }
}
