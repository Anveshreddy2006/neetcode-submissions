
class Solution {
    public int minimumTotal(List<List<Integer>> nums) {
        int n = nums.size();

        int[][] dp = new int[n][n];

        for (int i = nums.get(n - 1).size() - 1; i >= 0; i--) {
            dp[n - 1][i] = nums.get(n - 1).get(i);
            // system.out.print(dp[n-1][i]+" ");
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + nums.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}