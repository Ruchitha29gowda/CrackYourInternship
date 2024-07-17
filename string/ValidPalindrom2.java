package string;

public class ValidPalindrom2 {
    
}

class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrom(s)) return true;

        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return isPalindrom(s.substring(0, i)+s.substring(i+1, s.length())) || isPalindrom(s.substring(0, j)+s.substring(j+1, s.length()));
            }
        }

        return false;
    }

    public boolean isPalindrom(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}