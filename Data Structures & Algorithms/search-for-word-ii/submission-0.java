class Solution {
    static int[] dx = {-1,0,0,1};
    static int[] dy = {0,-1,1,0};
    public static boolean dfs(int x,int y,int idx,boolean[][] vis,char[][] nums,String s){
       if(idx==s.length()-1) return true;
       
        vis[x][y] = true;
        
        for(int i =0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<nums.length && ny>=0 && ny<nums[0].length && !vis[nx][ny] && s.charAt(idx+1)==nums[nx][ny] ){
                if( dfs(nx,ny,idx+1,vis,nums,s)){
                vis[nx][ny] = false;
                return true;
                }
              
            }
        }
        vis[x][y] = false;
        return false;
    }

    public static boolean is(char[][] nums, String word){
         int n   = nums.length;
        int m = nums[0].length;

        boolean[][] vis = new boolean[n+1][m+1];
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             if(word.charAt(0)==nums[i][j]){
                if(dfs(i,j,0,vis,nums,word)){
                    return true;
                }
             }
            }
        }
       
return false;
    }
    public List<String> findWords(char[][] board, String[] words) {
          List<String> ans = new ArrayList<>();

          for(String s : words){
            if(is(board,s)){
                ans.add(s);
            }
          }
          return ans;
    }
}
