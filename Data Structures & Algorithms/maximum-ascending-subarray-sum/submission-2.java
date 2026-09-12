class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum =0;

        int mx = Integer.MIN_VALUE;
         sum = nums[0];
           mx = Math.max(sum,mx);
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
            }else{
                mx = Math.max(sum,mx);
                sum = nums[i];
            }
        }
         mx = Math.max(sum,mx);
        return mx;
    }
}