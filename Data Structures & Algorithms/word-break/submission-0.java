class Solution {
    public static boolean solve(int i,int j,String s1,String s2,int[][] dp){
      if(i==s1.length()){
        if(j==s2.length()) return true;
        return false;
      }
      if(dp[i][j]!=-1){
        return dp[i][j]==1? true:false;
      }
     
      boolean is = false;

      if(s1.charAt(i)==s2.charAt(j)){
        is = solve(i+1,j+1,s1,s2,dp);
      }else{

      
        is = solve(i+1,j,s1,s2,dp);
      }
      dp[i][j] = is?1:0;
      return is;
    }
    public boolean wordBreak(String s, List<String> word) {
        StringBuilder sb = new StringBuilder();
        for(String ss: word){
            sb.append(ss);
        }
        int n1 = s.length();
        int n2 = sb.length();
        int[][] dp  =new int[n1+1][n2+1];
        for(int[] e:dp){
            Arrays.fill(e,-1);
        }
        if(sb.length()>s.length()) return false;
        return solve(0,0,s,sb.toString(),dp);
    }
}
