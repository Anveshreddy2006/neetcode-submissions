class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(arr.get(arr.size()-1)<nums[i]){
                arr.add(nums[i]);
            }else{
              int idx = binary(arr,nums[i]);

               if(idx!=-1){
                arr.set(idx,nums[i]);
               }
                
    
            }
            
        }
        return arr.size();

    }
    public static int binary( ArrayList<Integer> arr,int el){
        int lo =0;
        int hi= arr.size()-1;
        int idx = -1;

        while(lo<=hi){
            int mid = (hi+lo)/2;

            if(arr.get(mid)>=el){
                hi=mid-1;
                idx = mid;
            }else{
                lo = mid+1;
            }
        }
    return idx;
    }
}
