package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {


    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int m = graph[0].length;

        int color[] = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!dfsTraversal(i, 0, color, graph)) return false;
            }
        }
        return true;
    }

    private boolean dfsTraversal(int node, int col, int[] color, int[][] graph) {

        color[node] = col;

        for (int it : graph[node]) {
            if (color[it] == -1) {
                if (!dfsTraversal(it, 1 - col, color, graph)) return false;
            } else if (color[it] == col) {
                return false;
            }
        }
        return true;
    }
}
