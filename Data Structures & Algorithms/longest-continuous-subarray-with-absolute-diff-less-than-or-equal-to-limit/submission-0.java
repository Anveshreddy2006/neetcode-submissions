class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;

        int l = 0;

        int mx = nums[0];
        int mn = nums[0];

        int ans = 0;

        for (int r = 0; r < n; r++) {
            mx = Math.max(mx, nums[r]);
            mn = Math.min(mn, nums[r]);

            while (Math.abs(mx - mn) > limit && l < r) {
                if (nums[l] == mn) {
                    mn = Integer.MAX_VALUE;
                }
                if (nums[l] == mx) {
                    mx = Integer.MIN_VALUE;
                }
                l++;
                int li = l;

                while (li <= r) {
                    mn = Math.min(mn, nums[li]);
                    mx = Math.max(mx, nums[li]);
                    li++;
                }
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}