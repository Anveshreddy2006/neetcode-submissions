class Solution {
     public static void solve(int[] nums,int idx, List<List<Integer>> ans,List<Integer> ds,int t){
         if(t==0){
               ans.add(new ArrayList<>(ds));
                return;
            }
           

         if(idx==nums.length) return;
        
        
        

       

       
        
        
        solve(nums,idx+1,ans,ds,t);

         

         if(nums[idx]<=t){
            ds.add(nums[idx]);
          solve(nums,idx,ans,ds,t-nums[idx]);
           ds.remove(ds.size()-1);
         }
        
        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       
        List<List<Integer>> ans = new ArrayList<>();
         List<Integer> ds = new ArrayList<>();
        solve(nums,0,ans,ds,target);;
        return ans;
    }
}

    
    

