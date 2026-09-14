class Solution {
    public int numOfSubarrays(int[] arr) {
        int sum =0;
        int n  = arr.length;
        int cnt =0;

        for(int i=0;i<n;i++){
            sum =0;
            for(int j=i;j<n;j++){
               sum+=arr[j];
               if(sum%2!=0) cnt++;
            }
        }
        return cnt;
    }
}