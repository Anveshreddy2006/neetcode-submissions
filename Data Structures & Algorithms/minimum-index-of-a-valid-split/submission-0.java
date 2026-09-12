class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        HashMap<Integer, Integer> l = new HashMap<>();

        HashMap<Integer, Integer> r = new HashMap<>();

        for (int el : nums) {
            r.put(el, r.getOrDefault(el, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            l.put(num, l.getOrDefault(num, 0) + 1);

            r.put(num, r.get(num) - 1);

            int left = (i + 1);
            int right = (n - i - 1);

            if (2 * l.get(num) > left && 2 * r.get(num) > right) {
                return i;
            }
        }

        return -1;
    }
}