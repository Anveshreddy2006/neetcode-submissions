class Solution {
   /* public static int sol(int[] nums, int t, int[] dp) {
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
    }*/
    public int combinationSum4(int[] nums, int t) {
        int n = nums.length;
        int[] dp = new int[t + 1];
            Arrays.fill(dp,1);
        dp[0] =1;
        
        for(int i=1;i<=t;i++){
            dp[i] = 0;
            for(int j :nums){
                if((i-j)>=0){
                   dp[i] += dp[i-j];
                }
               
            }
        }
       

        return dp[t];
    }
}