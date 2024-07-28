package LinkedList;

public class AddTwoNumber {
    
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;

        while(l1!=null && l2!=null){
            int v = l1.val + l2.val +carry;
            if(v>0){
                temp.next = new ListNode(v%10);
                carry = v/10; 
            }
            else temp.next = new ListNode(v);

            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }

        while(l1!=null){
            int v = l1.val + carry;
            if(v>0){
                temp.next = new ListNode(v%10);
                carry = v/10; 
            }
            else temp.next = new ListNode(v);
            l1 = l1.next;
            temp = temp.next;
        }

        while(l2!=null){
            int v = l2.val + carry;
            if(v>0){
                temp.next = new ListNode(v%10);
                carry = v/10; 
            }
            else temp.next = new ListNode(v);
            l2 = l2.next;
            temp = temp.next;
        }

        if(carry>0)temp.next = new ListNode(carry);

        return ans.next;
    }
}
