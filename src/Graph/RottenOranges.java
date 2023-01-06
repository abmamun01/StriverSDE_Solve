package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int countFresh = 0;

        Queue<Pair> queue = new LinkedList<>();
        int visited[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Pair(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 0;
                }

                if (grid[i][j] == 1) countFresh++;
            }
        }


        int time = 0;
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, 1, 0, -1};
        int count = 0;


        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().column;
            int tme = queue.peek().time;

            time = Math.max(tme, time);
            queue.poll();


            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int nCol = col + delCol[i];

                if (nrow >= 0 && nrow < n && nCol >= 0 && nCol < m && visited[nrow][nCol] == 0 && grid[nrow][nCol] == 1) {

                    // akhan theke jekhane e move korbe 1 unit time barbe
                    // karon tmi jei jaygay acho sekhane to 0 but ak pa agaile e 1 hoye
                    // gelo thik temn ata jedike e e jabe 1unit hobe
                    queue.add(new Pair(nrow, nCol, time + 1));
                    visited[nrow][nCol] = 2;

                    // ai queue method ta to hocce upore 1 pase 1 nice & right saide 1 ghor agabe
                    // ar ata tokhon e agabe jokhon se kono fresh fruit tar sathe lagano thakbe
                    /// jodi fruit ta dure hoy tahole fresh fruit fresh e thakbe
                    count++;

                }
            }
        }

        // as question said that if there is even 1 fresh orange return -1
        // so here is checking that
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
