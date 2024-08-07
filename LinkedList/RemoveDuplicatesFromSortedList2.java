package LinkedList;

public class RemoveDuplicatesFromSortedList2 {
    
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
        HashMap<Integer , Integer> map= new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            int val = map.getOrDefault(temp.val, 0);
            map.put(temp.val, val+1);
            temp = temp.next;
        }

        temp = new ListNode(-1);
        temp.next = head;
        head = temp;

        while(temp!=null){
            while(temp.next!=null && map.get(temp.next.val)>1){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

        return head.next;
    }
}