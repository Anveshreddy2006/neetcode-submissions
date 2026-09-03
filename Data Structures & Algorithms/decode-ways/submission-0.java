class Solution {
    public static int sol(String s, int i, int[] dp) {
        if (i == s.length())
            return 1;
        if (s.charAt(i) == '0')
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int ways = sol(s, i + 1, dp);

        if (i + 1 < s.length()) {
            int nm = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');

            if (nm >= 10 && nm <= 26) {
                ways += sol(s, i + 2, dp);
            }
        }
        return dp[i] = ways;
    }
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return sol(s, 0, dp);
    }
}
