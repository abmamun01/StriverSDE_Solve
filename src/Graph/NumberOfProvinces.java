package Graph;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {

        boolean visited[] = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                count++;
                System.out.println();
                dfs(i, isConnected, visited);

            }
        }

        return count;
    }


    void dfs(int node, int[][] adjList, boolean[] visited) {

        visited[node] = true;
        for (int i = 0; i < adjList.length; i++) {
            if (visited[i] == false) {
                dfs(i, adjList, visited);
            }

        }

    }

    public void dfs(int[][] M, boolean[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == false) {
                visited[j] =true;
                dfs(M, visited, j);
            }
        }
    }
    public int findCircleNums(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == false) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

}
