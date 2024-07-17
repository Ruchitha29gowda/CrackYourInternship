import java.util.Stack;

public class ValidParinthesis {
    
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.add(')');
            }
            if(s.charAt(i)=='{'){
                stack.add('}');
            }
            if(s.charAt(i)=='['){
                stack.add(']');
            }

            if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                if(s.charAt(i)==stack.peek()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }

        return false;
    }
}