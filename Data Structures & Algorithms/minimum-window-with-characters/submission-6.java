class Solution {
    public boolean check(int[] f1,int[] f2){
        for(int i=0;i<128;i++){
            if(f2[i]>f1[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
   boolean is = false;

        int[] freq1= new int[128];
        int[] freq2= new int[128];

        for(char ch:t.toCharArray()){
            freq2[ch-'A']++;
        }
      //int min = Integer.MAX_VALUE;
    
      for(int i=0;i<t.length();i++){
        char ch=  s.charAt(i);
        freq1[ch-'A']++;

      }
    
      if(check(freq1,freq2)){
       // if(s.length()==t.length())return s;

        return s.substring(0,t.length());
      }
      int j=t.length();
      int  n = s.length();
      int i =0;
        int st = -1,end=-1;
        int min = Integer.MAX_VALUE;
      while(j<=n){

        while(check(freq1,freq2)){
            int idx= s.charAt(i)-'A';
            if(min>(j-i+1)){
               min = (j-i+1);
                end = j;
                st = i;
                
               
            }
            freq1[idx]--;
            i++;
            is = true;

        }
if(j==s.length()) break;
        freq1[s.charAt(j)-'A']++;
       // min = Math.min(min,j-i);
        j++;
      }
      
      if(is) return s.substring(st,end);
      return "";


    }
}
