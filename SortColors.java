class SortColors {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) zeros+=1;
            else if(nums[i]==1) ones+=1;
            else if(nums[i]==2) twos+=1;
        }

        int i=0;
        while(zeros>0){
            nums[i++] = 0;
            zeros-=1;
        }
        while(ones>0){
            nums[i++] = 1;
            ones-=1;
        }
        while(twos>0){
            nums[i++] = 2;
            twos-=1;
        }
    }
}