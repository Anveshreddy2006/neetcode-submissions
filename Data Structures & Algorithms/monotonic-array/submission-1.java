class Solution {
    public boolean isMonotonic(int[] nums) {
        int n  = nums.length;
        if(n==1) return true;
        if(nums[0]>nums[1]){
            for(int i=n-2;i>=0;i--){
                if(nums[i+1]>nums[i]){
                    return false;
                }
            }

        }else{
             for(int i=1;i<n;i++){
                if(nums[i-1]>nums[i]){
                    return false;
                }

        }
        }
        return true;
       
    }
}