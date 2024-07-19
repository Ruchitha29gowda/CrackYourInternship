import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Four_Sum {
    
}

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length-2; j++){
                int l=j+1;
                int r = nums.length-1;
                while(l<r){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[l] + (long)nums[r];
                    if(sum<target){
                        l++;
                        while(nums[l]==nums[l-1] && l<r){
                            l++;
                        }
                    }
                    else if(sum==target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);

                        set.add(list);
                        l++;
                        r--;
                    }
                    else{
                        r--;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}