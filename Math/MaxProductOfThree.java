public class MaxProductOfThree {
    
}

class Solution {
    public int maximumProduct(int[] nums) {
        // int ans = Integer.MIN_VALUE;
        Arrays.sort(nums);
        boolean flag =false;
        if(nums[0]<0 && nums[nums.length-1]<0) flag = true;
        if(flag==true) return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        if(nums[0]<0 && nums[1]<0){
            if(nums[0]*nums[1]*nums[nums.length-1] > nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]){
                return nums[0]*nums[1]*nums[nums.length-1];
            }
        }
        
        return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    }
}