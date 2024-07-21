public class Prin_Duplicate_characters{
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        int[] ch = new int[26];
        for(int i=0; i<s.length(); i++){
            int indx = s.charAt(i) - 'a';
            ch[indx]+=1;
        }

        for(int i=0; i<ch.length; i++){
            if(ch[i]>1){
                char c = (char)(i +'a');
                System.out.print(c+" = "+ch[i]+"  ,  ");
            }
        }
    }
}