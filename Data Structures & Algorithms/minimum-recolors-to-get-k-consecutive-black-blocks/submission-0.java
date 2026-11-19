public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res = blocks.length();
        for (int i = 0; i <= blocks.length() - k; i++) {
            int count_w = 0;
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    count_w++;
                }
            }
            res = Math.min(res, count_w);
        }
        return res;
    }
}