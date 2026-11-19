class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int cnt = 0;
        int mx = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i-1]+1==nums[i] || nums[i-1]==nums[i]){
            cnt++;
            }else{
                mx = Math.max(mx,cnt);
                cnt = 0;
            }
        }
         mx = Math.max(mx,cnt);
                cnt = 0;
        return mx;
    }
}
