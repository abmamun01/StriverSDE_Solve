package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectUnDirectedGraph {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) visited[i] = false;
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                if (checkedForCycle(i, V, adj, visited)) return true;
            }
        }

        return false;
    }

    private boolean checkedForCycle(int src, int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        visited[src] = true;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(src, -1));

        while (!queue.isEmpty()) {
            int node = queue.peek().src;
            int parent = queue.peek().parent;
            queue.remove();

            for (int adjacentNode : adj.get(node)) {
                if (visited[adjacentNode] == false) {
                    visited[adjacentNode] = true;
                    queue.add(new Pair(adjacentNode, node));
                } else if (parent != adjacentNode) {
                    return true;
                }
            }
        }
        return false;
    }

    class Pair {
        int src;
        int parent;


        public Pair(int src, int parent) {
            this.src = src;
            this.parent = parent;
        }
    }
}
