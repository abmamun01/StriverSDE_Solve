package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {


    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int count = 0;
        int countFresh = 0;

        int[][] result = grid;

        boolean visited[][] = new boolean[n][m];

        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};

        Queue<Pair> queue = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    visited[i][j] = true;
                    queue.add(new Pair(i, j, 0));
                }

                // countring fresh tomato so that these fresh tomato will be rotten then rotten count++
                // if rotten == fresh then all fresh are rotten other wise no
                if (grid[i][j] == 1) countFresh++;
            }
        }

        int time = 0;

        while (!queue.isEmpty()) {

            int inRow = queue.peek().row;
            int inCol = queue.peek().column;
            int inTime = queue.peek().time;

            time = Math.max(time, inTime);
            queue.remove();

            for (int i = 0; i < 4; i++) {
                int nRow = inRow + delRow[i];
                int nCol = inCol + delCol[i];

                if (nRow >= 0 && nRow < grid.length && nCol >= 0 && nCol < grid[0].length
                        && !visited[nRow][nCol] && grid[nRow][nCol] == 1) {

                    count++;
                    queue.add(new Pair(nRow, nCol, inTime + 1));
                    visited[nRow][nCol] = true;

                }
            }
        }

        if (count != countFresh) return -1;
        return time;
    }


    class Pair {
        int row;
        int column;
        int time;

        public Pair(int row, int column, int time) {
            this.row = row;
            this.column = column;
            this.time = time;
        }
    }
}
