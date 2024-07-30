package Stack;

public class DailyTemperature {
    
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] nxtGreater = new int[n];
        
        for(int i = n-1; i>=0; i--){
            if(st.isEmpty()){
                nxtGreater[i] = -1;
            }
            else{
                while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()) nxtGreater[i] = -1;
                else nxtGreater[i] = st.peek();
            }
            st.add(i);
        }

        for(int i=0; i<nxtGreater.length; i++){
            
            if(nxtGreater[i]==-1) nxtGreater[i] = 0;
            else nxtGreater[i] = nxtGreater[i] - i;
            // System.out.print(nxtGreater[i]+"  ");
        }

        return nxtGreater;
    }
}