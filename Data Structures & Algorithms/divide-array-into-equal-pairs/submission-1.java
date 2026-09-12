class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int mx = 0;

        for(int i:nums){
            mx = Math.max(mx,i);
        }
        int[] f = new int[mx+1];

        for(int i=0;i<n;i++){
            f[nums[i]]++;
        }

        for(int i=1;i<=mx;i++){
            if(f[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}