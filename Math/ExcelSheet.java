public class ExcelSheet {
    
}

class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = helper(columnNumber);
        return ans;
    }

    public String helper(int n){
        if(n==0) return "";
        n=n-1;
        int R = n%26;
        char c = (char)('A' + R);
        return helper(n/26) +c;
    }
}