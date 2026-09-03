class Solution {
    public static void solve(int[] nums,int idx, List<List<Integer>> ans,List<Integer> ds){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[idx]);
        solve(nums,idx+1,ans,ds);
        
        ds.remove(ds.size()-1);
        solve(nums,idx+1,ans,ds);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         List<Integer> ds = new ArrayList<>();
        solve(nums,0,ans,ds);;
        return ans;
    }
}
