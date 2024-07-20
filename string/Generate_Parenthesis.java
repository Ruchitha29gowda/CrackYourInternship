package string;
public class Generate_Parenthesis {
    public void helper(int pending, String s, Stack<Character> st){
        if(pending==0){
            while(!st.isEmpty()){
                s+=st.pop();
            }
        }
        for(int i=0; i<pending; i++){
            if(st.isEmpty){
                st.add('(');
            }
            helper(pending-1,  s+="(", st);
            st.pop();
            if(!st.isEmpty || st.peek()=='('){
                helper(pending,  s+st.pop(), st);
                st.add('(');
                helper(pending-1,  s+'(', st);
                st.pop();
            }
        }
    }
}
