class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int a = st.pop(); 
                int b = st.pop(); 

                switch (s) {
                    case "+": st.push(b + a); break;
                    case "-": st.push(b - a); break;
                    case "*": st.push(b * a); break;
                    case "/": st.push(b / a); break;
                }
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        
        return st.pop();
    }
}
