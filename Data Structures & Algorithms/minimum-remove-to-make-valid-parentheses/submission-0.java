class Solution {
    public String minRemoveToMakeValid(String s) {
        int cnt =0;
        int n  = s.length();

        Stack<Integer> st = new Stack<>();
        boolean[] r = new boolean[n];

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    r[i] = true;
                }
            }
        }
        while(!st.isEmpty()){
            r[st.pop()] = true;
        }

        StringBuilder sb = new StringBuilder();

       
        for(int i=0;i<s.length();i++){
            if(!r[i]){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}