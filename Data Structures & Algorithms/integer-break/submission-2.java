class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        

        dp[1] =1;

        for(int i=2;i<=n;i++){

            if(n==i){
                dp[i]=0;
            }else{
                dp[i] = i;
            }

            for(int j=1;j<i;j++){
                int val = dp[j]*dp[i-j];
                dp[i] = Math.max(dp[i],val);
            }
        }
        return dp[n];

    }
}