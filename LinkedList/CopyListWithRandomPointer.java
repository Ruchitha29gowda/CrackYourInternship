package LinkedList;

public class CopyListWithRandomPointer {
    
}

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node temp = head.next;
        Node newHead = new Node(head.val);
        Node t = newHead;
        while(temp!=null){
            t.next = new Node(temp.val);
            t = t.next; 
            temp = temp.next;
        }
        // printLL(newHead);

        temp = head;
        t = newHead;
        while(temp!=null){
            int j = findJumps(temp, head);
            Node pointer = newHead;
            for(int i=0; i<j; i++){
                pointer = pointer.next;
            }
            t.random = pointer;
            temp = temp.next;
            t=t.next;
        }

        return newHead;
    }

    public int findJumps(Node temp, Node head){
        Node h = head;
        int i = 0;
        while(h!=null && temp.random!=h){
            h = h.next;
            i++;
        }
        return i;
    }

    // public void printLL(Node root){
    //     Node t = root;
    //     while(t!=null){
    //         System.out.print(t.val+" ");
    //         t=t.next;
    //     }
    //     System.out.println();
    // }
}