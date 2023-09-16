package DSA.GraphRepresentation;

import java.util.ArrayList;
import java.util.List;

class BFSIterative {
    private int[][] adj;
    private boolean[] visited;
    private boolean[] hasApple;
    private int v;

    BFSIterative(int v) {
        this.v = v;
        adj = new int[v][v];
        visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new int[v];
        }
    }

    public void addEdge(int u, int v) {
        adj[u][v] = 1;
    }

    public void setApple(int v) {
        hasApple = new boolean[v];
        hasApple[2] = true;
        hasApple[4] = true;
        hasApple[5] = true;

    }

    public void bfsTraverse(int s) {
        List<Integer> queue = new ArrayList<>();
        queue.add(s);
        int levelWiseTime = 1, time = 0;
        while (!queue.isEmpty()) {
            s = queue.get(0);
            System.out.println("source:: " + s + " " + "levelWiseTime:: " + levelWiseTime);
            visited[s] = true;
            queue.remove(0);
            levelWiseTime = levelWiseTime * 2;
            for (int i = 0; i < v; i++) {
                if (adj[s][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    if (hasApple[i])
                        time = time + levelWiseTime;
                }
            }
        }
    }

}

public class BFS_iterative {
    public static void main(String[] args) {
        BFSIterative g = new BFSIterative(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(2, 6);
        g.setApple(7);
        g.bfsTraverse(0);
    }
}
