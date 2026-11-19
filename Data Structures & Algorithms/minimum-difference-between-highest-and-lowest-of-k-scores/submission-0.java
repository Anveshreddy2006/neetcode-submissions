public class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = k - 1, res = Integer.MAX_VALUE;
        while (r < nums.length) {
            res = Math.min(res, nums[r] - nums[l]);
            l++;
            r++;
        }
        return res;
    }
}