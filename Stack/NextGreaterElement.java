package Stack;

public class NextGreaterElement {
    
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int ans[]= new int[nums1.length];

       
        int len1 = nums1.length;
        int len2 = nums2.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[len2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i], i);
        }

        for(int i= len2 -1; i>=0; i--){
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                while(!st.isEmpty() && nums2[i]>=nums2[st.peek()]){
                    int p =st.pop();
                    // System.out.print("popped "+p+" ");
                }
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            st.add(i);
            // System.out.print("added"+i+" ");
        }

        int[] res = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int indx = map.get(nums1[i]);
            if(ans[indx]==-1){
                res[i] = -1;
            }
            else{
                res[i] = nums2[ans[indx]];
            }
        }

        return res;
    }
}