class Solution {
    public int maxArea(int[] h) {
        int ans = 0;

        int l =0;
        int  n = h.length;
        int r = n-1;
        int left =h[0];
        int right =h[n-1];
        int mx = Integer.MIN_VALUE;
        while(l<r){
             int area = (r-l)*(int)Math.min(h[l],h[r]);
             mx = Math.max(mx,area);
             if(h[l]<=h[r]){
                l++;
             }else{
                r--;
             }

        }
        return mx;
    }
}
