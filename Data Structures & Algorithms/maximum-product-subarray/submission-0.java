class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int mx = Integer.MIN_VALUE;
        int cur = 1;

        for(int i=0;i<n;i++){
            cur = Math.max(cur*nums[i],nums[i]);
            mx = Math.max(mx,cur);
        }
        return mx;
    }
}
