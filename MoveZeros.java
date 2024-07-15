class MoveZeros {
    public void moveZeroes(int[] nums) {
        int indx=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[indx++]=nums[i];
            }
        }
        for(int i=indx; i<nums.length;i++){
            nums[indx++]=0;
        }
    }
}
