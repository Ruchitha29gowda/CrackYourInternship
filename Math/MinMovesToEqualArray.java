import java.util.Arrays;

public class MinMovesToEqualArray {
    
}

class Solution {
    public int minMoves2(int[] nums) {
        int mid = nums.length/2;
        Arrays.sort(nums);
        int ans =0;

        for(int i=0; i<nums.length; i++){
            if(i==mid) continue;
            ans+=(Math.abs(nums[mid]-nums[i]));
        }
        return ans;
    }
}