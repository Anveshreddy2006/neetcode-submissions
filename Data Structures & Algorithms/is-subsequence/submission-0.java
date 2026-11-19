class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0;
        int j =0;
         int n = t.length();
        while(j<n){
            if(s.charAt(i)==t.charAt(j)){
                i++;

            }
            j++;
        }
        return i==s.length();
    }
}