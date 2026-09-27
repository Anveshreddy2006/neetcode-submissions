class Solution {
    public int appendCharacters(String s, String t) {
       /* int n = s.length();
        int m  = t.length();
      
        int cnt =0;
        int[][] dp = new int[n+1][m+1];


           for(int j=1;j<=m;j++) {
            
              for(int i=1;i<=n;i++)
            {
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[n][m]);

return m-dp[n][m];*/
int i=0;
int j=0;
int n  = s.length();
int  m = t.length();

while(i<n){
    if(j<m && s.charAt(i)==t.charAt(j)){
        j++;
    }
    i++;
}
return m-j;

    }
}