import java.util.HashMap;

public class IntegerToRoman {
    
}

class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90, "XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        

        String number = Integer.toString(num);
        String ans = "";
        for(int i=1; i<=number.length(); i++){
            int val = num%(int)Math.pow(10, i);
            // System.out.print(val+" ");
            num = num-val;
            if(map.containsKey(val)){    
                ans=map.get(val)+ans;
            }
            else{
                ans=findVal(val)+ans;
            }
        }
        // System.out.print("\n"+ans);
        return ans;
    }

    public String findVal(int num){
        if(num%1000==0){
            String v="";
            for(int i=0; i<num/1000;i++){
                v+="M";
            }
            return v;
        }
        else if(num%500 == 0){
            String v="";
            for(int i=0; i<num/500;i++){
                v+="D";
            }
            return v;
        }
        else if(num%100 == 0){
            String v="";
            if(num>500){
                v+="D";
                num-=500;
            }
            for(int i=0; i<num/100;i++){
                v+="C";
            }
            return v;
        }
        else if(num%10==0){
            String v="";
            if(num>50){
                v+="L";
                num-=50;
            }
            for(int i=0; i<num/10;i++){
                v+="X";
            }
            return v;
        }
        else{
            String v="";
            if(num>5){
                v+="V";
                num-=5;
            }
            for(int i=0; i<num;i++){
                v+="I";
            }
            return v;
        }
    }
}