package DSA.Graph_;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS_TraversePractice {
    static LinkedList<Integer>[] adj = new LinkedList[5];

    public static void init() {
        for (int i = 0; i < 5; i++) {
            adj[i] = new LinkedList<>();
        }
        adj[0].add(1);
        adj[0].add(3);
        adj[1].add(2);
        adj[1].add(4);
    }

    public static void BFS(int s) {
        boolean[] visited = new boolean[5];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.println(u);
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }
    public static boolean[] visited = new boolean[5];
    public static void DFS(int s){
        if(!visited[s]){
            visited[s] =true;
            System.out.println(s);
            for(int v : adj[s]){
                DFS(v);
            }
        }
    }

    public static void main(String[] args) {
        BFS_DFS_TraversePractice.init();
        BFS_DFS_TraversePractice.BFS(0);
        BFS_DFS_TraversePractice.DFS(0);
        
    }
}
