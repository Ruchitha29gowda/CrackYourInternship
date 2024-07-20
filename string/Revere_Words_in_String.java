package string;

import java.util.Stack;

public class Revere_Words_in_String {
    
    public static void main(String[] args) {
        String s = "the  sky is blue";
        s = s.trim();
        String ans = "";
        String[] s_arr = s.split(" ");

        int i=0; 
        Stack<String> st = new Stack<>();
        while (i<s_arr.length) {
            if(s_arr[i].length()==0){
                i+=1;
                continue;
            }
            else{
                st.add(s_arr[i]);
            }
            i+=1;
        }

        while(st.size()>1){
            ans=ans+st.pop();
            ans=ans+" ";
        }
        ans=ans+st.pop();


        System.out.println(ans.trim());;
    }
}
