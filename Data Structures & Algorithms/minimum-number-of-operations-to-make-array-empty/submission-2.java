class Solution {
    public int minOperations(int[] nums) {
       
        int cnt = 0;
        int n = nums.length;
       HashMap<Integer,Integer> map = new HashMap<>();

       

      for(int el :nums){
        map.put(el,map.getOrDefault(el,0)+1);
      }

        for (int f : map.values()) {
            
            if(f==1) return -1;

             cnt+=f/3;

             if(f%3==1){
                cnt--;
                cnt+=2;
             }else if(f%2==1){
                cnt++;
             }
        }
        return cnt;
    }
}