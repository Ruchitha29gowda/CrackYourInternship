package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j= i+1;
            int k= nums.length -1;

            while(j<k){
                int val = nums[i]+nums[j]+nums[k];
                if(val<0) j++;
                else if(val>0) k--;
                else if(val == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    ans.add(temp);
                    j++;

                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }

        return ans;
    }
}