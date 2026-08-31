class Solution {
    class pair {
        int x;
        int y;
        int dis;

        pair(int xx, int yy, int d) {
            x = xx;
            y = yy;
            dis = d;
        }
    }

    public int[][] kClosest(int[][] p, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.dis, a.dis));

        for (int[] el : p) {
            int x = el[0];
            int y = el[1];

            int dist = x * x + y * y;

            pq.add(new pair(x, y, dist));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];
        int i = 0;

        while (!pq.isEmpty()) {
            pair pp = pq.poll();

            ans[i][0] = pp.x;
            ans[i][1] = pp.y;
            i++;
        }

        return ans;
    }
}