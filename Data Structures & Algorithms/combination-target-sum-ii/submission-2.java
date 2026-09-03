class Solution {
    public static void solve(
        int[] nums, int idx,  List<List<Integer>> ans, List<Integer> ds, int t) {
        if (t == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }


          for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i-1]==nums[i]) continue;

            if(nums[i]>t) break;

            ds.add(nums[i]);
             solve(nums, i+1, ans, ds, t - nums[i]);
            ds.remove(ds.size() - 1);
           
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
       // HashSet<List<Integer>> ans = new HashSet<>();
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(nums, 0, ans, ds, target);
      

        
        return ans;
    }
}
