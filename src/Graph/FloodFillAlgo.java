package Graph;

public class FloodFillAlgo {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int initialColor = image[sr][sc];
        int[][] ans = image;
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};

        dfs(sr, sc, ans, image, newColor, delRow, delCol, initialColor);
        return ans;
    }

    private void dfs(int sRow, int sCol, int[][] ans, int[][] image,
                     int newColor, int[] delRow, int[] delCol, int initialColor) {

        ans[sRow][sCol] = newColor;
        int n = image.length;
        int m = image[0].length;

        for (int i = 0; i < 4; i++) {
            int nRow = sRow + delRow[i];
            int nCol = sCol + delCol[i];

            if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && image[nRow][nCol]
                    == initialColor && ans[nRow][nCol] != newColor) {
                dfs(nRow, nCol, ans, image, newColor, delRow, delCol, initialColor);
            }
        }
    }
}
