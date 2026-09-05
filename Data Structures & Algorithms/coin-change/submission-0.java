class Solution {
    public int coinChange(int[] nums, int a) {
        int[] dp = new int[a + 1];
        Arrays.fill(dp, a + 1);
        dp[0] = 0;

        for (int i = 1; i <= a; i++) {
            for (int el : nums) {
                if ((i - el) >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - el] + 1);
                }
            }
        }

        if (dp[a] != a + 1)
            return dp[a];
        return -1;
    }
}
