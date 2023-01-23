package Graph;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {

        int length = isConnected.length;
        boolean visited[] = new boolean[length];
        int count = 0;

        for (int i = 0; i < length; i++) {

            if (!visited[i]) {
                dfsTraversal(i, visited, isConnected);
                count++;
            }
        }
        return count;
    }

    private void dfsTraversal(int givenNode, boolean[] visited, int[][] isConnected) {
        visited[givenNode] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[givenNode][i] == 1 && !visited[i]) {
                System.out.println(" Given Node "+isConnected[givenNode][i]);
                dfsTraversal(i, visited, isConnected);
            }
        }

    }

}
