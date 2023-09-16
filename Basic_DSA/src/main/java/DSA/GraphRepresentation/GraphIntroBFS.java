package DSA.GraphRepresentation;

import java.util.*;

class Graph {
    private int v;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue = new LinkedList<>();

    Graph(int V) {
        v = V;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    //add element to a existing node
    public void addElement(int u, int v) {
        adj[u].add(v);
    }

    //Traverse a graph
    public void graphTraverse() {
        for (int k = 0; k < v; k++) {
            System.out.print("source:" + k + "->");
            Iterator<Integer> it = adj[k].listIterator();
            while (it.hasNext()) {
                System.out.print(" " + it.next());
            }
            System.out.println();
        }
    }

    public void BFS(int s) {
        boolean[] visited = new boolean[v];
        queue.add(s);
        while (!queue.isEmpty()) {
            visited[s] = true;
            s = queue.poll();
            System.out.print("source:" + s + "->");
            Iterator<Integer> it = adj[s].listIterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                    System.out.print(" " + n);
                }
            }
            System.out.println();
        }
    }

}

public class GraphIntroBFS {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addElement(0, 1);
        graph.addElement(0, 2);
        graph.addElement(1, 3);
        graph.addElement(1, 4);
        graph.addElement(2, 0);
        //graph.graphTraverse();
        graph.BFS(2);

    }
}
