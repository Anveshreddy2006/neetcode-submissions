class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        int idx = n-1;

      
        for(int i=n-1;i>=0;i--){

            while (!st.isEmpty() && t[st.peek()] <= t[i]) {
                st.pop();
            }

            
                if(!st.isEmpty()){
                    ans[i] = st.peek()-i;
                } 
               
            st.push(i);
            
        }
        return ans;
    }
}
