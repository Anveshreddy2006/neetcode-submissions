class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int cnt = 0;

        for (int f : freq.values()) {
            if (f == 1) {
                return -1;
            }

            cnt += f / 3;

            if (f % 3 == 1) {
                // Example: 4 = 2 + 2
                cnt--;
                cnt += 2;
            } else if (f % 3 == 2) {
                // Example: 5 = 3 + 2
                cnt++;
            }
        }

        return cnt;
    }
}