class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int cnt =0;
        int  n = nums.length;
        int mx =nums[n-1];
        int[] freq = new int[mx+1];

        for(int el:nums){
            freq[el]++;
        }

       
        for(int i=1;i<=mx;i++){
            if(freq[i]==1){
                return -1;
            }
        }

         for(int i=1;i<=mx;i++){
           
           while(freq[i]>=3){
            cnt++;
            freq[i] -=3;
           }

           if(freq[i]==1){
            cnt--;
            freq[i]+=3;
            cnt+=2;
            freq[i]-=4;
           }

           if(freq[i]==2){
            cnt++;
            freq[i]-=2;
           }

        
        }
        return cnt;


        

    }
}