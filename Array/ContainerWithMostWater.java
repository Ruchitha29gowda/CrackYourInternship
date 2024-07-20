package Array;
public class ContainerWithMostWater {
    
}

class Solution {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int lp =0;
        int rp = height.length - 1;
        while(lp<rp){
            int maxLevel = Math.min(height[lp], height[rp]);
            maxWater = Math.max(maxWater , maxLevel*(rp-lp));
            if(height[lp]<height[rp]) lp++;
            else rp--;
        }

        return maxWater;
    }
}