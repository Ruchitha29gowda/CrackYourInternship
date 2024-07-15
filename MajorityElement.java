import java.util.HashMap;

class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majLen= nums.length/2;
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        for(int key: map.keySet()){
            if(map.get(key)>majLen){
                return key;
            }
        }
        return 0;
    }
}