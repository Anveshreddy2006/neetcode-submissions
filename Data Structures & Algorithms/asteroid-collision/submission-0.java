class Solution {
    public int[] asteroidCollision(int[] a) {
         Stack<Integer> st = new Stack<>();
         int i=0;
         int n  = a.length;

         while(i<n){
            if(a[i]>0){
                st.push(a[i]);
            }else{
                if(!st.isEmpty() && st.peek() <= (-a[i])){
                    st.pop();
                }
            }
            i++;
         }


    int[] ans = new int[st.size()];
    int nn  = st.size();
    int j =0;

    while(!st.isEmpty()){
        ans[j++] = st.pop();
    }

    int[] el = new int[nn];

    for(int k=0;k<nn;k++){
        el[k] = ans[nn-k-1];
    }
    return el;

 
    }
}