class Solution {
    public static int sol(int[] nums, int t, int[] dp) {
        if (t == 0)
            return 1;

        if (dp[t] != -1)
            return dp[t];
        int ans = 0;
        for (int el : nums) {
            if (el <= t) {
                ans += sol(nums, t - el, dp);
            }
        }

        return dp[t] = ans;
    }
    public int combinationSum4(int[] nums, int t) {
        int n = nums.length;
        int[] dp = new int[t + 1];

        Arrays.fill(dp, -1);

        return sol(nums, t, dp);
    }
}