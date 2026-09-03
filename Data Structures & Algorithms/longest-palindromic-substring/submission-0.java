class Solution {
    public static boolean pal(String s){
        int st = 0;
        int en = s.length()-1;
        while(st<=en){
            if(s.charAt(st)!=s.charAt(en)) return false;
            st++;
            en--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int st = -1;
        int end = -1;
        int len = 0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(pal(s.substring(i,j+1))){
                  
                  if((j-i+1)>len){
                    len = (j-i+1);
                    st = i;
                    end = j;
                  }
                }
            }
        }

        if(st==-1 && end==-1) return "";
        return s.substring(st,end+1);
    }
}
