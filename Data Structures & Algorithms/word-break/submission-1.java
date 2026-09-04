class Solution {
    public static boolean solve(int i, String s, List<String> word, int[] dp) {
        if (i == s.length()) {
            return true;
        }
        if (dp[i] != -1) {
            return dp[i] == 1;
        }

        for (String wor : word) {
            if (i + wor.length() > s.length())
                continue;
            boolean is = true;

            for (int j = 0; j < wor.length(); j++) {
                if (s.charAt(i + j) != wor.charAt(j)) {
                    is = false;
                    break;
                }
            }
            if (is && solve(i + wor.length(), s, word, dp)) {
                dp[i] = 1;
                return true;
            }
        }
        dp[i] = 0;
        return false;
    }
    public boolean wordBreak(String s, List<String> word) {
        int n1 = s.length();

        int[] dp = new int[n1 + 1];

        Arrays.fill(dp, -1);

        return solve(0, s, word, dp);
    }
}
