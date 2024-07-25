public class AddBinary {
    
}

class Solution {
    public String addBinary(String a, String b) {
        String ans ="";
        int i = a.length()-1;
        int j = b.length()-1;
        String k="";
        String carry = "";
        while(i>=0 && j>=0){
            if(a.charAt(i)=='1' && b.charAt(j)=='1'){
                if(carry.length()==1){
                    k='1'+k;
                    carry = "1";
                }
                else{
                    k='0'+k;
                    carry = "1";
                }
            }
            else if(a.charAt(i)=='0' && b.charAt(j)=='0'){
                if(carry.length()==1){
                    k='1'+k;
                    carry = "";
                }
                else{
                    k='0'+k;
                    carry = "";
                }
            }
            else{
                if(carry.length()==1){
                    k='0'+k;
                    carry = "1";
                }
                else{
                    k='1'+k;
                    carry = "";
                }
            }
            i--;
            j--;
        }

        while(i>=0){
            System.out.println("A remaining");
            if(a.charAt(i)=='1' && carry.length()==1){
                k = '0'+k;
            }
            else if(a.charAt(i)=='1' && carry.length()==0 || a.charAt(i)=='0' && carry.length()==1){
                k = '1'+k;
                carry ="";
            }
            else if(a.charAt(i)=='0' && carry.length()==0){
                k = '0' + k;
            }
            i--;
        }

        while(j>=0){
            System.out.println("B remaining");
            if(b.charAt(j)=='1' && carry.length()==1){
                k = '0'+k;
            }
            else if(b.charAt(j)=='1' && carry.length()==0 || b.charAt(j)=='0' && carry.length()==1){
                k = '1'+k;
                carry ="";
            }
            else if(b.charAt(j)=='0' && carry.length()==0){
                k = '0' + k;
            }
            j--;
        }

        if(carry.length()==1){
            k = '1'+k;
        }

        return k;
    }
}