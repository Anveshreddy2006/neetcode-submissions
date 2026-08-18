class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int n = strs.length;
           Arrays.sort(strs);

        String s1   = strs[0];
        String s2 = strs[n-1];


        for(int i =0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
}