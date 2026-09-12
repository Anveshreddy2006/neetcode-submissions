class Solution {
    public int heightChecker(int[] h) {
        int n = h.length;
         int[] arr = Arrays.copyOf(h, h.length);
        Arrays.sort(h);
        int cnt =0;

        for(int i=0;i<n;i++){
            if(arr[i]!=h[i]){
                cnt++;
            }

        }
        return cnt;
    }
}