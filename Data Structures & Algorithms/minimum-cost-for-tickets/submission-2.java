class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int last = days[n - 1];

        int[] dp = new int[last + 1];
        boolean[] vis = new boolean[last + 1];
        for (int d : days) {
            vis[d] = true;
        }

        for (int day = 1; day <= last; day++) {
            if (!vis[day]) {
                dp[day] = dp[day - 1];
            } else {
                int one = costs[0] + dp[day - 1];

                int s = costs[1];
                if (day >= 7) {
                    s += dp[day - 7];
                }

                int t = costs[2];
                if (day >= 30) {
                    t += dp[day - 30];
                }

                dp[day] = Math.min(one, Math.min(t, s));
            }
        }
        return dp[last];
    }
}