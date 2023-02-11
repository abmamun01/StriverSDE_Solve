package Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinctIsland {


    /*

    1. run a for loop
    2. find unvisited node and run a DFS algorithm
    3. in the dfs take base node and subtract other 4 directional node from base
        and add it into list

    4. add the list into HashSet


    * */
    private void dfs(int row, int col, boolean[][] vis,
                     int[][] grid, ArrayList<String> vec, int row0, int col0) {
        // mark the cell as visited
        vis[row][col] = true;
        // subtracting from base node
        vec.add(toString(row - row0, col - col0));

        int n = grid.length;
        int m = grid[0].length;
        // delta row and delta column
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, -1, 0, +1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            // condition checking
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    !vis[nrow][ncol] && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, grid, vec, row0, col0);
            }
        }
    }

    private String toString(int r, int c) {
        return Integer.toString(r) + " " + Integer.toString(c);
    }

    int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        HashSet<ArrayList<String>> st = new HashSet<>();

        // traverse the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // if not visited and is a land cell
                if (!vis[i][j] && grid[i][j] == 1) {
                    ArrayList<String> vec = new ArrayList<>();
                    dfs(i, j, vis, grid, vec, i, j);
                    // store it in HashSet
                    st.add(vec);
                }
            }
        }
        return st.size();
    }
}
