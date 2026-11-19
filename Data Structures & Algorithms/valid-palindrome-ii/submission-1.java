class Solution {
    public boolean validPalindrome(String s) {
        int k = 1;
        int n  = s.length();

        int i = 0;
        int j = n-1;
        boolean is = true;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else if(s.charAt(i)!=s.charAt(j) && k>0){
                if(s.charAt(i+1)==s.charAt(j)){
                    i++;
                }else if(s.charAt(i)==s.charAt(j-1)){
                    j--;
                }
                k--;
            }else{
                is = false;
                break;
            
            }
        }
        return is;
    }
}