class Solution {
    public static boolean solve(int idx,int t,int[] nums,int[][] dp){
        if(t==0) return true;
        if(idx==nums.length){
            return false;
        }
        if(dp[idx][t]!=-1){
            return dp[idx][t]==1;
        }

        boolean not = solve(idx+1,t,nums,dp);
       boolean take = false;
        if(nums[idx]<=t){
         take = solve(idx+1,t-nums[idx],nums,dp);
        }
        dp[idx][t] = (take || not) ? 1:0;
        return take || not;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int el:nums){
            sum+=el;
        }
        if(sum%2!=0) return false;
          int n = nums.length;
        int shalf = sum/2;
        int[][] dp = new int[n][shalf+1];
        for(int[] e:dp){
            Arrays.fill(e,-1);
        }
        return solve(0,shalf,nums,dp);
    }
}
