public class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) total += num;
        int remain = (int) (total % p);
        if (remain == 0)
            return 0;

        int res = nums.length;
        long curSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            curSum = (curSum + nums[i]) % p;
            int prefix = (int) ((curSum - remain + p) % p);
            if (map.containsKey(prefix)) {
                res = Math.min(res, i - map.get(prefix));
            }
            map.put((int) curSum, i);
        }

        return res == nums.length ? -1 : res;
    }
}