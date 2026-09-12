class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int mx  = Integer.MIN_VALUE;
        int n  = nums.length;
        int cnt =1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                cnt++;
            }else{
                mx = Math.max(mx,cnt);
                cnt =1;
            }
        }
        mx = Math.max(cnt,mx);
        cnt =1;
         for(int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                cnt++;
            }else{
                mx = Math.max(mx,cnt);
                cnt =1;
            }
        }
        mx = Math.max(cnt,mx);
        return mx;
    }
}