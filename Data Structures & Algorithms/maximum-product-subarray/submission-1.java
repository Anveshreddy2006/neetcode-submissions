class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int mx =nums[0];
        int cur =nums[0];
        int min = nums[0];

        for(int i=1;i<n;i++){

            int x = nums[i];

            if(x<0){
                int t = min;
                min = mx;
                mx = t;
            }
          
            
            mx = Math.max(mx*x,x);
            min = Math.min(min*x,x);

            cur = Math.max(cur,mx);
        }
        return cur;
    }
}
