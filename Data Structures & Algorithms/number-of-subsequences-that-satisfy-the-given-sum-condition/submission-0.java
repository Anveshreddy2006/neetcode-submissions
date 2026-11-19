public class Solution {
    private static final int MOD = 1000000007;

    public int numSubseq(int[] nums, int target) {
        return dfs(nums, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, target);
    }

    private int dfs(int[] nums, int maxi, int mini, int i, int target) {
        if (i == nums.length) {
            if (mini != Integer.MAX_VALUE && (maxi + mini) <= target) {
                return 1;
            }
            return 0;
        }

        int skip = dfs(nums, maxi, mini, i + 1, target);
        int include = dfs(nums, Math.max(maxi, nums[i]), Math.min(mini, nums[i]), i + 1, target);
        return (skip + include) % MOD;
    }
}