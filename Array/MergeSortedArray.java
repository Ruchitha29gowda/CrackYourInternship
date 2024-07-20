package Array;
import java.util.ArrayList;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<m; i++){
            list.add(nums1[i]);
        }
        int n1 = 0;
        int n2 = 0;
        int indx = 0;

        while(n1<list.size() && n2<n){
            if(list.get(n1)<=nums2[n2]){
                nums1[indx++] = list.get(n1);
                n1++;
            }
            else if(list.get(n1)>nums2[n2]){
                nums1[indx++] = nums2[n2];
                n2++;
            }
        }

        while(n1<list.size() && indx<nums1.length){
            nums1[indx++] = list.get(n1);
            n1++;
        }

        while(n2<n && indx<nums1.length){
            nums1[indx++] = nums2[n2];
            n2++;
        }
    }
}