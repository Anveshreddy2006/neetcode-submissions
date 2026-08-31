class KthLargest {
 PriorityQueue<Integer> minHeap;
    int size;
    public KthLargest(int k, int[] nums) {
         size = k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
         minHeap.offer(val);

        if (minHeap.size() > size) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
