package DSA.Graph_;

import java.util.Iterator;
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

    public void DFS_Recursive(int u) {
        if (!visited[u]) {
            visited[u]=true;
            System.out.println(u);

            for (int v : adj[u]) {
                DFS_Recursive(v);
            }
        }
    }
}

public class DFS_RecursiveAdjList {
    public static void main(String[] args) {
        GraphDFSRecursive g = new GraphDFSRecursive(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        g.DFS_Recursive(0);
    }
}
