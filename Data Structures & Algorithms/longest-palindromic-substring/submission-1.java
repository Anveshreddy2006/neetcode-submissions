class Solution {
    public static String pal(String s, int ss, int e) {
        int st = ss;
        int en = e;
       while (st >= 0 && en < s.length() && s.charAt(st) == s.charAt(en)) {
           
            st--;
            en++;
        }
        return s.substring(st+1, en );
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int st = -1;
        int end = -1;
        int len = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            String ev = pal(s, i, i + 1);
            String od = pal(s, i, i);

            if (ans.length() < ev.length()) {
                ans = ev;
            }

            if (ans.length() < od.length()) {
                ans = od;
            }
        }

        return ans;
    }
}
