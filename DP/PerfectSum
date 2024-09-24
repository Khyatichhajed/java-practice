
/** Que link - https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1?page=2&company=Amazon&sortBy=submissions */
class PerfectSum {

    static int mod = 1000000007;

    /**
     * Method to calculate number of subset that adds up to given sum
     */
    public int perfectSum(int arr[], int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];

        /**
         * Base initialization
         */
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                // Do not include the current element
                dp[i][j] = dp[i - 1][j];

                // Include the current element if it does not exceed the remaining sum
                if (j >= arr[i - 1]) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - arr[i - 1]]) % mod;
                }
            }
        }

        return dp[n][sum];
    }
}
