package LinkedList;

public class MultiplyLinkedList {
    
}

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = 1000000007;
        long n1=0;
        while(first!=null){
            n1= ((n1*10)%mod + (first.data)%mod)%mod;
            first=first.next;
        }
        // System.out.println(n1);
        
        long n2 =0;
        while(second!=null){
            n2 = ((n2*10)%mod + (second.data)%mod)%mod;
            second=second.next;
        }
        
        return (n1%mod * n2%mod )%mod;
    }
}