class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int[] f = new int[n+1];

        for(int i=0;i<n;i++){
            f[nums[i]]++;
        }

        for(int i=1;i<=n;i++){
            if(f[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}