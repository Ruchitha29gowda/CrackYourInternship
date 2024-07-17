package string;

public class LongestCommonPrefix {
    
}

class Solution {
    static class Node{
        Node[] ch = new Node[26];
        boolean eow;
        int freq;
        Node(){
            for(int i=0; i<26;i++){
                this.ch[i] = null;
            }
            this.freq = 0;
        }
    }
    public static Node root;

    public static void insert(String s){
        if(s.length()==0) return;
        Node curr = root;
        for(int i=0; i<s.length(); i++){
            int indx = s.charAt(i)-'a';
            if(curr.ch[indx]==null){
                curr.ch[indx] = new Node();
            }
            else{
                curr.ch[indx].freq +=1;
            }
            curr = curr.ch[indx];
        }
        curr.eow = true;
    }



    public String longestCommonPrefix(String[] strs) {

        //USING TRIES
        root = new Node();
        root.freq =-1;
        for(int i=0; i<strs.length; i++){
            insert(strs[i]);
            if(strs[i].length()==0) return "";
        }

        String ans="";

        while(root!=null){
            int count = 0;
            int ch=0;
            for(int i=0; i<26; i++){
                if(root.ch[i]!=null && root.ch[i].freq==strs.length-1){
                    ch = i;
                    count+=1;
                }
            }
            if(count==1){
                ans+= (char)(ch +'a');
                root=root.ch[ch];
            }
            if(count>1){
                break;
            }
            if(count==0) return ans;
        }
        return ans;
    }
}