package Trie;

public class ImplementTrie {
    
}

class Trie {

    static class Node{
        Node[] children = new Node[26];
        boolean eow;

        Node(){
            for(int i=0; i<26; i++){
                this.children[i]=null;
            }
        }
    }

    static Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int indx = word.charAt(i) - 'a';
            if(curr.children[indx]==null){
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }

        curr.eow = true;
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int indx = word.charAt(i) - 'a';
            if(curr.children[indx]==null){
                return false;
            }
            curr = curr.children[indx];
        }

        if(curr.eow != true) return false;

        return true;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int indx = prefix.charAt(i) - 'a';
            if(curr.children[indx]==null){
                return false;
            }
            curr = curr.children[indx];
        }

        // if(curr.eow == true) return true;

        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */