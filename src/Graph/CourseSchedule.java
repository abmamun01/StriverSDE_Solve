package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // form a graph
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }


        int m = prerequisites.length;

        for (int i = 0; i < m; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int indegree[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> topo = new ArrayList<>();
        // o(v+e    )

        while (!queue.isEmpty()) {
            int node = queue.peek();
            queue.remove();
            topo.add(node);

            // node is in your topo sort
            // so please remove it from the indegree
            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) queue.add(it);
            }
        }


        if (topo.size() == numCourses) return true;

        return false;
    }
}
