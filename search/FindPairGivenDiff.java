package search;

public class FindPairGivenDiff {
    
}
class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        HashSet<Integer> map = new HashSet<>();
        // for(int i=0; i<arr.length; i++){
        //     map.add(arr[i]);
        // }
        
        for(int i = 0; i<n; i++){
            if(map.contains(arr[i]+x) || map.contains(arr[i]-x)) return 1;
            map.add(arr[i]);
        }
        
        return -1;
    }
}