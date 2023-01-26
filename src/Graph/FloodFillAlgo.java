package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFillAlgo {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int ans[][] = image;
        int initialColor = image[sr][sc];

        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};

        dfsTraversal(sr, sc, initialColor, ans, image, color, delRow, delCol);
        return ans;
    }

    private void dfsTraversal(int sr, int sc, int initialColor, int[][] ans, int[][] image, int newColor, int[] delRow, int[] delCol) {

        ans[sr][sc] = newColor;

        for (int i = 0; i < 0; i++) {
            int nRow = sr + delRow[i];
            int nCol = sc + delCol[i];
            if (nRow >= 0 && nRow < image.length && nCol >= 0 && nCol < image[0].length && image[nRow][nCol] == initialColor && ans[nRow][nCol] != newColor) {
                dfsTraversal(sr, sc, initialColor, ans, image, newColor, delRow, delCol);
            }
        }
    }


    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
