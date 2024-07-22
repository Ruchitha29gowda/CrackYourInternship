package string;

import java.util.Stack;

public class SimplifyPath {
    
}

class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] str = path.split("/");

        for(int i=0; i<str.length; i++){
            System.out.print(str[i]+" , ");
        }

        for(int i=0; i<str.length; i++){
            if(str[i].equals(".")) continue;
            else if(str[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(str[i].length()!=0){
                st.push(str[i]);
            }
        }

        String ans="";
        System.out.println("Stack: ");
        while(st.size()>1){
            ans = "/"+st.pop()+ans;
            System.out.println(ans);
        }
        if(!st.isEmpty()){
            ans = st.pop()+ans;
            System.out.println(ans);
        }

        return "/"+ans;
    }
}
