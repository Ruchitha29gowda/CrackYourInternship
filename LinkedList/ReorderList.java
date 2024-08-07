public class ReorderList {
    
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
    public void reorderList(ListNode head) {
        ListNode mid = findmid(head);

        ListNode curr = mid.next;
        mid.next = null;
        ListNode prev = null;
        ListNode nxt = null;

        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        ListNode left = head;
        ListNode right = prev;

        while(left!=null && right!=null){
            ListNode nxtLeft = left.next;
            ListNode nxtRight = right.next;

            left.next = right;
            right.next = nxtLeft;

            left = nxtLeft;
            right = nxtRight;
        }
    }

    public ListNode findmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}