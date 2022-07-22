package Day3;

public class GridUniquePaths {

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; ++j) {

                // jehetu 1st col and 1st row thakle jawar rasta akta e tai
                // by default 1 hobe
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;

                } else {
                    // left r side r 1ta and up side r 1ta value jog++ kore
                    // present path ber kora possible
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
