import java.util.HashSet;

class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = nums[0];
        set.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }

        return ans;
    }
}