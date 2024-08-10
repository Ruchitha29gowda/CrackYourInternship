package Stack;

public class MinCostTreeFronLeafvalues {
    
}


class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int ans =0;

        for(int i=1; i<arr.length; i++){
            while(!st.isEmpty()&& st.peek()<=arr[i]){
                int val = st.pop();
                if(st.isEmpty()) ans+=val*arr[i];
                else ans+=val*Math.min(st.peek(), arr[i]);
            }
            st.push(arr[i]);
        }
        
        while(st.size()>1){
            ans+=st.pop()*st.peek();
        }

        return ans;
    }
}