package Stack;

public class RemoveAllAdjacentDuplicatesInString {
    
}

class Solution {
    public class Pair{
        char ch ;
        int count ;

        Pair(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        String ans ="";
        for(int i=0; i<s.length(); i++){
            if(st.isEmpty() || s.charAt(i)!=st.peek().ch){
                st.add(new Pair(s.charAt(i), 1));
            }
            else{
                int c = st.peek().count;
                st.add(new Pair(s.charAt(i), c +1));
                if(st.peek().count ==k){
                    for(int j=0; j<k; j++) st.pop();
                }
            }
        }

        while(!st.isEmpty()){
            ans = st.pop().ch + ans;
        }
        System.out.println(ans);

        return ans;
    }
}