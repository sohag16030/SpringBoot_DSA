package Leetcode.NeetCode;

import java.util.HashSet;
import java.util.Set;

public class Valid_SudoKu_36 {
    public static void main() {
        char[][] board = new char[9][9];
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int box = (i / 3) * 3 + (j / 3);
                if (board[i][j] != '.') {
                    String rowSign = "row-" + i + board[i][j];
                    String colSign = "col-" + j + board[i][j];
                    String boxSign = "box-" + (i / 3) * 3 + (j / 3) + board[i][j];
                    if (!seen.add(rowSign) || !seen.add(colSign)) {
                        return ;
                    }
                    if (!seen.add(boxSign)){
                        return ;
                    }

                }
            }
        }
        return ;

    }
}