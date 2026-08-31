class Solution {
    public int lastStoneWeight(int[] s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int el : s) {
            pq.add(el);
        }

        while (pq.size() > 1) {
            if (pq.size() > 1) {
                int el1 = pq.poll();
                int el2 = pq.poll();

                if (el1 > el2 || el2 > el1) {
                    pq.add(Math.abs(el2 - el1));
                }
            }
        }
        int ans = pq.isEmpty() ? 0:pq.poll();
        return ans;
    }
}
