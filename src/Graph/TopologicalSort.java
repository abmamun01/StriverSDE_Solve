package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    //Function to return list containing vertices in Topological order.
    // whose dfs is completed (when backtracking), store it in stack
    //
    //
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean visited[] = new boolean[V];
        int[] ans = new int[V];
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfsTraversal(i, adj, visited, stack);
            }
        }

        int i = 0;
        while (!stack.isEmpty()) {
            ans[i++] = stack.pop();
        }

        return ans;
    }

    private static void dfsTraversal(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack) {

        visited[node] = true;


        for (int it : adj.get(node)) {
            if (!visited[it]) {
                dfsTraversal(it, adj, visited, stack);
            }
        }

        // as it is dfs so it will run to all adjacency node .
        // in the last adjacency node if it's not find any adjacency node then it will return back so
        // before going back add to stack
        // so it will add last to fast node

        stack.push(node);


    }
}
