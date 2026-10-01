class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums1.length;
        int m = nums2.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        int idx =0;
        int[] next = new int[m];
        for(int i=m-1;i>=0;i--){
             while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            if(!st.isEmpty() && st.peek()>nums2[i]){
                next[i] = st.peek();
            }

           
            st.push(nums2[i]);
        }
        for(int i=0;i<m;i++){
            if(next[i]==0){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],next[i]);
            }


        }
        int[] ans = new int[n];
        for(int  i=0;i<n;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}