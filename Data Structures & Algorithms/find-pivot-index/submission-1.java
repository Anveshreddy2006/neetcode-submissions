class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] lsum = new int[n + 1];
        int[] rsum = new int[n + 1];
        lsum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            lsum[i] = lsum[i - 1] + nums[i];
        }

        rsum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rsum[i] = nums[i] + rsum[i + 1];
        }

        int idx = -1;
        for (int i = 1; i < n; i++) {
            if (lsum[i - 1] == rsum[i + 1]) {
                idx = i;
                break;
            }
        }
        if(rsum[1]==0){
            idx=0;
        }else if(lsum[n-1]==0){
            idx = n-1;
        }
        return idx;
    }
}