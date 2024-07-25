public class ValidNumber {
    
}

class Solution {
    public boolean isNumber(String s) {
        boolean e = false;
        boolean dot = false;
        boolean n = false;

        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                n = true;
            }
            else if(c=='+' || c=='-'){
                if(i!=0){
                    if(s.charAt(i-1)!='e'){
                        return false;
                    }
                }
            }
            else if(c=='e'){
                if(e==true || n==false){
                    return false;
                }
                e = true;
                n = false; //to check if numbers are there after e
            }
            else if(c=='.'){
                if(dot==true || e==true) return false;
                dot = true;
            }
            else{
                return false;
            }
        }

        return n;
    }
}