package Stack;

public class EvaluateReversePolishNotation {
    
}

class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1) return Integer.parseInt(tokens[0]);

        Stack<Integer>st = new Stack<>();
        st.push(Integer.parseInt(tokens[0]));
        st.push(Integer.parseInt(tokens[1]));

        for(int i=2; i<tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")  || tokens[i].equals("/") ){
                int v1 = st.pop();
                int ans =0;

                if(tokens[i].equals("+") )  ans = st.pop() + v1;
                if(tokens[i].equals("-") )  ans = st.pop() - v1;
                if(tokens[i].equals("*") )  ans = st.pop() * v1;
                if(tokens[i].equals("/") )  ans = st.pop() / v1;
                

                st.push(ans);
            }
            else st.push(Integer.parseInt(tokens[i]));  
            // System.out.println(st); 
        }

        return st.pop();
    }
}