package string;

import java.util.Stack;

public class BasicCalculator2 {
    
}

class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num =0;
        char op = '+';

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch - '0');
            }

            if(isOp(ch) || i==s.length()-1){
                if(op=='+') st.push(num);
                else if(op=='-') st.push(-num);
                else if(op=='*') st.push(st.pop() * num);
                else if(op=='/') st.push(st.pop() / num);

                num =0;
                op = ch;
            }
        }

        int ans =0;

        while(!st.isEmpty()){
            ans+=st.pop();
        }

        return ans;
    }

    public boolean isOp(char c){
        if(c=='+' || c=='-' ||c=='*' ||c=='/') return true;

        return false;
    }
}