package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Generate_Parenthesis {
    public static void helper(int pending, String s, Stack<Character> st, List<String> ans){
        System.out.print(s+"  ");
        if(pending==0){
            // System.out.println("\npending == 0 && stack : "+st);
            // while(!st.isEmpty()){
            //     s+=')';
            //     st.pop();
            //     // System.out.print(s+"  ");
            // }
            if(!st.isEmpty()){
                for(int i=0; i<st.size(); i++){
                    s+=')';
                }
            }
            System.out.println("\nbreak  && ANS: "+s+" LEN: "+s.length());
            ans.add(0, s);
            return;
        }

        if(st.isEmpty()){
            st.add('(');
            helper(pending-1,  s+'(', st, ans);
            st.pop();
        }
        else{
            char val = st.pop();
            helper(pending,  s+')', st, ans);
            st.add(val);

            st.add('(');
            helper(pending-1,  s+'(', st, ans);
            st.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        List<String> ans = new ArrayList<>();
        helper(3, "", st, ans);
        System.out.println(ans);
    }
}
