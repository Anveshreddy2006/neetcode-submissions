class Solution {
    public static boolean check(int[] f1,int[] f2){
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
            
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int n = s2.length();
         int k = s1.length();

         if(k>n)return false;

        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }

       

        for(int i=0;i<Math.min(k,n);i++){
            freq2[s2.charAt(i)-'a']++;
        }

        boolean ans = false;

        for(int i=Math.min(k,n);i<n;i++){

            if(check(freq1,freq2)){
                  ans = true;
                break;
            }

            freq2[s2.charAt(i-k)-'a']--;
            freq2[s2.charAt(i)-'a']++;

        }
         if(check(freq1,freq2)){
 ans = true;
            }
        return ans;
    }  
}
