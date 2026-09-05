class Solution {
  
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
 

        Arrays.fill(dp, n + 1);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1;j*j<=n;j++) {
                int sq = j*j;
                if ((i - sq) >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - sq] + 1);
                }
            }
        }

        if (dp[n] != n + 1)
            return dp[n];
        return -1;

    }
}