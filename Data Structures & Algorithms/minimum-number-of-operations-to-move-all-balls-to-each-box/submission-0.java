class Solution {
    public int[] minOperations(String b) {
        int n = b.length();
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int a =0;
            for(int j=0;j<i;j++){
               
               if(b.charAt(j)=='1'){
                a+=Math.abs(i-j);
               }

            }

            for(int k=i+1;k<n;k++){
             if(b.charAt(k)=='1'){
                a+=Math.abs(i-k);
               }
            }
             ans[i] = a;
        }
        return ans;
    }
   
}