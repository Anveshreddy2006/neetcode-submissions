class Solution {
    public double averageWaitingTime(int[][] c) {
        long time = 0;
        int n = c.length;
        long last = 0;

        for (int i = 0; i < n; i++) {
            int aaa = c[i][0];
            int pre = c[i][1];

            last = Math.max(last, aaa);
            last += pre;
            time += last - aaa;
        }
        return (double) time / n;
    }
}