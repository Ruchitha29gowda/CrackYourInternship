public class SumOfSubArrayMin {
    
}

class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        Arrays.fill(left, -1);
        Arrays.fill(right, arr.length);

        for(int i=0; i<left.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                left[i] = st.peek();
            }

            st.push(i);
        }
        
        // printArray(left);
        st.clear();

        for(int i=right.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                right[i] = st.peek();
            }

            st.push(i);
        }
        
        // printArray(right);

        long answer = 0;
        int mod = (int)(Math.pow(10, 9)+ 7);

        for(int i=0; i<left.length; i++){
            long min = (long)(i - left[i])*(right[i] - i)%mod * arr[i]%mod;
            answer+=min;
            // System.out.print(min+" -> ");
            answer%=mod;
        }

        return (int)answer;
    }

    // public void printArray(int[] arr){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
}