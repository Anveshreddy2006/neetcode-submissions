class Solution {
    public static int solve(int[] nums, int idx, int end, int[] dp) {
        if (idx >= end)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];

        return dp[idx] = Math.max(
                   solve(nums, idx + 1, end, dp), nums[idx] + solve(nums, idx + 2, end, dp));
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];

        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int robFirst = solve(nums, 0, n - 1, dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int robLast = solve(nums, 1, n, dp2);

        return Math.max(robFirst, robLast);
    }
}
