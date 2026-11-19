class Solution {
    public static int solve(int i, int[] days, int[] c, int[] dp) {
        if (i >= dp.length)
            return 0;

        if (dp[i] != -1)
            return dp[i];
        int one = one = c[0] + solve(i + 1, days, c, dp);
        int j = i;
        while (j < days.length && days[j] < days[i] + 7) {
            j++;
        }

        int seven = seven = c[1] + solve(j, days, c, dp);
        j = i;
        while (j < days.length && days[j] < days[i] + 30) {
            j++;
        }

        int thirty = thirty = c[2] + solve(j, days, c, dp);

        return Math.min(one, Math.min(seven, thirty));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;

        int[] dp = new int[days.length];
        Arrays.fill(dp, -1);
        return solve(0, days, costs, dp);
    }
}