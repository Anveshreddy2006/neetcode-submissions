class Solution {
    public static int solve(int idx,int[] cost,int[] dp){
        if(idx>=cost.length) return 0;

        if(dp[idx]!=-1) return dp[idx];

        return dp[idx]  = Math.min(solve(idx+1,cost,dp)+cost[idx],solve(idx+2,cost,dp)+cost[idx]);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int an = Math.min(solve(0,cost,dp),solve(1,cost,dp));
        return an;
    }
}
