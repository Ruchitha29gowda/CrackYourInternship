package string;

public class FindFirstOccurence {
    
}

class Solution {
    public int strStr(String haystack, String needle) {
        int indx = 0;
        for(int i=0; i<=haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i+needle.length()).compareTo(needle)==0){
                return i;
            }
        }

        return -1;
    }
}
