import Tree.ConvertSortedArrayToBinaryTree;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Solution {
    public int findCircleNum(int[][] isConnected) {

        boolean visited[] = new boolean[isConnected.length];

        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < isConnected.length; i++) {

            dfsT(0, visited, list, isConnected);
            count++;
        }

        return count;
    }

    private void dfsT(int node, boolean[] visited, ArrayList<Integer> list, int[][] isConnected) {

        visited[node] = true;

        for (int i = 0; i < isConnected.length; i++) {
            if ( visited[i] == false) {
                dfsT(node, visited, list, isConnected);
            }

        }
    }
}//end of class