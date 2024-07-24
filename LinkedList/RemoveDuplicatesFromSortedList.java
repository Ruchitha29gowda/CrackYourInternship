package LinkedList;

public class RemoveDuplicatesFromSortedList {
    
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
    public ListNode deleteDuplicates(ListNode head) {
        helper(head);
        return head;
    }

    public void helper(ListNode head){
        if(head==null) return;

        ListNode temp = head;
        if(temp.next!=null){
            while(temp.next!=null && temp.next.val == temp.val ){
                temp.next = temp.next.next;
            }
            if(temp.next==null) return;
            helper(temp.next);
        }
        
    }
}