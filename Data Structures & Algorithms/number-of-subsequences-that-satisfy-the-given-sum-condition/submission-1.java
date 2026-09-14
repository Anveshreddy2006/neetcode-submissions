public class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0, mod = 1000000007;
        int r = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            while (i <= r && nums[i] + nums[r] > target) {
                r--;
            }
            if (i <= r) {
                res = (res + power(2, r - i, mod)) % mod;
            }
        }
        return res;
    }

    private int power(int base, int exp, int mod) {
        long result = 1, b = base;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * b) % mod;
            b = (b * b) % mod;
            exp >>= 1;
        }
        return (int) result;
    }
}