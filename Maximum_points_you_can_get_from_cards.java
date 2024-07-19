public class Maximum_points_you_can_get_from_cards {
    
}

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] pref = new int[cardPoints.length+1];
        pref[0] =0;
        int len = cardPoints.length;
        for(int i=0; i<len; i++){
            pref[i+1]=pref[i]+cardPoints[i];
        }

        if(k==len){
            return pref[len];
        }

        int i=0;
        int j= len - k - 1;
        int maxPoints =0;
        while(j<len){
            int points = pref[i]+(pref[len]-pref[j+1]);
            // System.out.println(pref[i]+" + ("+pref[len]+" - "+pref[j]+") = "+points);
            maxPoints = Math.max(points, maxPoints);
            i++;
            j++;
        }   

        return maxPoints;

    }
}