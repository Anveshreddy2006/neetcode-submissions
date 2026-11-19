class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        int mx = Integer.MIN_VALUE;

        for(int i=2;i<=n/2;i++){

            if(n%i==0){
                int cnt = n/i;
                dp[i] = (int)Math.pow(i,cnt);
                mx = Math.max(mx,dp[i]);
            }
        }
        return mx;

    }
}