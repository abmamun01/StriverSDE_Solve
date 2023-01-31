package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFillAlgo {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

            int n = image.length;
            int m = image[0].length;

            int initialColor=image[sr][sc];
            boolean visited[][] = new boolean[n][m];
            int result[][] = image;


            int delRow[] = {-1, 0, +1, 0};
            int delCol[] = {0, +1, 0, -1};



            dfsTraversal(sr, sc, delRow, delCol, visited, image, result, newColor,initialColor);



            return result;
        }

        private void dfsTraversal(int givenRow, int givenCol, int[] delRow, int[] delCol, boolean[][] visited, int[][] image, int[][] result, int newColor,int initialColor) {

            visited[givenRow][givenCol] = true;
            result[givenRow][givenCol] = newColor;

            for (int i = 0; i < 4; i++) {

                int nRow = givenRow + delRow[i];
                int nCol = givenCol + delCol[i];

                if (nRow >= 0 && nRow < image.length && nCol >= 0 && nCol < image[0].length
                        && !visited[nRow][nCol] && image[nRow][nCol] == initialColor) {

                    visited[nRow][nCol] = true;
                    result[nRow][nCol] = newColor;
                    dfsTraversal(nRow, nCol, delRow, delCol, visited, image, result,newColor,initialColor);

                }
            }

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
