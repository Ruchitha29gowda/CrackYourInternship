package Array;

public class LargestRectangleInHistogram {
    
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0) return 0;
        if(heights.length==1) return heights[0];


        int area = 0;
        int[] n_left = new int[heights.length];
        int[] n_right = new int[heights.length];

        nextSmallerleft(n_left, heights);
        nextSmallerRight(n_right, heights);


        for(int i=0; i<heights.length; i++){
            area = Math.max(area, heights[i]*(n_right[i]-n_left[i]-1));
        }
        return area;
    }

    public static void nextSmallerleft(int[] left, int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<left.length; i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()) left[i]=-1;
            else{
                left[i]=st.peek();
            }

            st.add(i);
        }

        for(int i=0; i<left.length; i++){
            System.out.print(left[i]+"  ");
        }
        System.out.println();
    }

    public static void nextSmallerRight(int[] right, int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=right.length-1; i>=0; i  --){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()) right[i]= right.length;
            else{
                right[i]=st.peek();
            }
            st.add(i);
        }

        for(int i=0; i<right.length; i++){
            System.out.print(right[i]+"  ");
        }
        System.out.println();
    }
}