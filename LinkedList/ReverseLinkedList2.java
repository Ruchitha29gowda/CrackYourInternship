public class ReverseLinkedList2 {
    
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode LP = dummy;
        for(int i=0; i<left-1; i++){
            LP = LP.next;
        }
        // System.out.print(LP.val+"   ");

        ListNode curr = LP.next;
        ListNode prev = null;
        ListNode next = null;
        for(int i=0; i<right-left+1; i++){
            System.out.print(curr.val+"   ");
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // System.out.print(curr.val+"   ");
        
        LP.next.next = curr;
        LP.next = prev;
        

        return dummy.next;
    }
}