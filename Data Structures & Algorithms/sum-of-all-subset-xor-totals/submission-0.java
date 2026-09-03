class Solution {
    public static int solve(int[] nums,int idx,int ans){
        if(idx>=nums.length) return ans;

        int t = solve(nums,idx+1,ans^nums[idx]);
        
        int not = solve(nums,idx+1,ans);
        return t+not;
    }

    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }
}