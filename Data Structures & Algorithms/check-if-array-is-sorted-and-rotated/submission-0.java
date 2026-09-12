class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] b  = new int[n];
        int k = 0;

        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                k = i;
                break;
            }
        }
        for(int i=0;i<n;i++){
            b[i] = nums[(i+k)%n];
        }

        for(int i=1;i<n;i++){
            if(b[i-1]>b[i]) return false;
        }
        return true;
    }
}