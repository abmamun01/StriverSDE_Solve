package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFillAlgo {
    public int numEnclaves(int[][] grid) {


        int n = grid.length;
        int m = grid[0].length;

        int result[][] = grid;
        boolean visited[][] = new boolean[n][m];

        Queue<Pair> queue = new LinkedList<>();

        for (int j = 0; j < n; j++) {
            // first row
            if (grid[0][j] == 1 && !visited[0][j]) {

                queue.add(new Pair(0, j));
            }
            // last col
            if (grid[n - 1][j] == 1 && !visited[n - 1][j]) {
                queue.add(new Pair(n - 1, j));

            }
        }

        for (int i = 0; i < m; i++) {

        }
    }

    class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

}
