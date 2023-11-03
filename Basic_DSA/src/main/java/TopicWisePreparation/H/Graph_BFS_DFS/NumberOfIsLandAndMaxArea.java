package TopicWisePreparation.H.Graph_BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
    public int n;
    public int m;

    public Pair(int n, int m) {
        this.n = n;
        this.m = m;
    }
}

public class NumberOfIsLandAndMaxArea {
    static String[][] grid = {{"1", "1", "1", "1", "0"},
            {"1", "1", "0", "0", "1"},
            {"1", "1", "0", "0", "0"},
            {"0", "0", "0", "1", "1"}};
    static int n = grid.length;
    static int m = grid[0].length;
    static Boolean[][] visited = new Boolean[n][m];
    static Queue<Pair> queue = new LinkedList<>();
    static int[] row = {-1, 0, 1, 0};
    static int[] col = {0, 1, 0, -1};

    public static void main(String[] args) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++)
                visited[x][y] = false;
        }
        int island = 0;
        int mayBeMaxArea = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j].equals("1")) {
                    island++;
                    mayBeMaxArea = bfsCall(i, j);
                    max = Math.max(mayBeMaxArea, max);
                }
            }
        }
        System.out.println("Number of island:" + island);
        System.out.println("MaxArea of island:" + max);
    }

    private static int bfsCall(int i, int j) {
        int mayBeMaxArea = 0;
        queue.add(new Pair(i, j));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            for (int k = 0; k < 4; k++) {
                int r = pair.n + row[k], c = pair.m + col[k];
                if (isSafe(r, c) && !visited[r][c] && grid[r][c].equals("1")) {
                    visited[r][c] = true;
                    queue.add(new Pair(r, c));
                    System.out.println(r + " " + c);
                    mayBeMaxArea++;
                }
            }
        }
        return mayBeMaxArea;
    }

    private static boolean isSafe(int r, int c) {
        if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length)
            return true;
        else
            return false;
    }
}
