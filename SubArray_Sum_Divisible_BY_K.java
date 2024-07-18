import java.util.HashMap;

public class SubArray_Sum_Divisible_BY_K {
    
}

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int pref =0;
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            pref = (nums[i]+pref)%k;
            if(pref<0){
                pref+=k;
            }
            if(map.containsKey(pref)){
                count+=map.get(pref);
                map.put(pref, map.get(pref)+1);
            }
            else map.put(pref, 1);
        }

        return count;
    }
}