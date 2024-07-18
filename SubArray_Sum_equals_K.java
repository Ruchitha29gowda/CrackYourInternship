import java.util.HashMap;

public class SubArray_Sum_equals_K {
    
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        int pref =0;
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<nums.length; i++){
            pref += nums[i];
            if(map.containsKey(pref - k)){
                count+=map.get(pref - k);
            }
            if(map.containsKey(pref)){
                map.put(pref , map.get(pref) + 1);
            }
            else map.put(pref , 1);
        }

        return count;
    }
}