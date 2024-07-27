package string;

public class SmallestWindowSubstring {
    
}

class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int start =0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int count = t.length();
        int map[] = new int[128];
        // for(int i=0; i<t.length(); i++){
        //     map[t.charAt(i)]+=1;
        // }

        for (char c : t.toCharArray()) map[c]++;
        
        while(end<s.length()){
            if(map[s.charAt(end++)]-- >0){
                count-=1;
            }
            // ch[end]-=1;
            // end+=1;

            while(count==0){
                if(end - start < minLen){
                    minLen = end - start;
                    minStart = start;
                }

                if(map[s.charAt(start++)]++ ==0){
                    count +=1;
                }
                // map[ch[start]]+=1;
                // start+=1;
            }
        }

        return minLen == Integer.MAX_VALUE ? "": s.substring(minStart, minStart + minLen);

    }
}