package Stack;

public class BackspaceStringCompare {
    
}

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else st.add(s.charAt(i));
        }
        s = "";
        while(!st.isEmpty()){
            s+=st.pop();
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else st.add(t.charAt(i));
        }
        t = "";
        while(!st.isEmpty()){
            t+=st.pop();
        }
        return s.equals(t);
    }
}