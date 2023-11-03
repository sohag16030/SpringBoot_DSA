package TopicWisePreparation.H.Graph_BFS_DFS;

public class DFS_NumberOfIsLandAndMaxArea {
    static String[][] grid = {{"1", "1", "1", "1", "0"},
            {"1", "1", "0", "0", "1"},
            {"1", "1", "0", "0", "0"},
            {"0", "0", "0", "1", "1"}};
    static int n = grid.length;
    static int m = grid[0].length;
    static boolean[][] visited = new boolean[n][m];
    static int[] row = {-1, 0, 1, 0};
    static int[] col = {0, 1, 0, -1};
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j].equals("1")) {
                    int isLandCount = 1;
                    visited[i][j] = true;
                    System.out.println(i + " " + j);
                    isLandCount = dfsCall(grid, i, j, isLandCount);
                    max = Math.max(max, isLandCount);
                }
            }
        }
        System.out.println(max);
    }

    private static int dfsCall(String[][] grid, int i, int j, int isLandCount) {
        for (int k = 0; k < 4; k++) {
            int r = i + row[k], c = j + col[k];
            if (isSafePos(r, c) && !visited[r][c] && grid[r][c].equals("1")) {
                isLandCount++;
                System.out.println(r + "," + c + "  count" + isLandCount);
                visited[r][c] = true;
                isLandCount = dfsCall(grid, r, c, isLandCount);
            }
        }
        return isLandCount;
    }

    private static boolean isSafePos(int r, int c) {
        if (r >= 0 && r < n && c >= 0 && c < m) return true;
        return false;
    }
}
