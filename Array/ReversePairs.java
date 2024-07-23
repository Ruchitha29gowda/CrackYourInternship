package Array;

public class ReversePairs {
    
}

class Solution {
    public static int count=0;
    public int reversePairs(int[] nums) {
        count =0;
        merge(nums, 0, nums.length-1);
        return count;
    }

    public void merge(int[] nums, int si, int ei ){
        if(si>=ei) return;
        int mid = si + (ei - si)/2;
        merge(nums, si, mid);
        merge(nums, mid+1, ei);
        sort(nums, si, ei, mid);
    }

    public void sort(int nums[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int right =mid+1;
        for(int i=si; i<=mid; i++){
            while(right<=ei && (long)nums[i]>(long)nums[right]*2){
                right++;
            }
            count += right - (mid+1);
        }
        int i=si; 
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(nums[i]<=nums[j]){
                temp[k++] = nums[i++];
            }
            if(nums[i]>nums[j]){
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid ){
            temp[k++] = nums[i++];
        }

        while(j<=ei ){
            temp[k++] = nums[j++];
        }

        i=0;
        for(int n = si; n<=ei; n++){
            nums[n] = temp[i++];
        }
    }
}