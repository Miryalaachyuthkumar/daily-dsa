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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
        {
            return null;
        }
        ListNode dum = new ListNode(0);
        ListNode tail = dum;
        ListNode cur = head;
        while(cur!=null)
        {
            tail.next = new ListNode(cur.val);
            tail = tail.next;
            if(cur.next == null)
            {
                break;
            }
            cur = cur.next.next;
        }
        cur = head;
        cur = cur.next;
        while(cur!=null)
        {
            tail.next = new ListNode(cur.val);
            tail = tail.next;
            if(cur.next == null)
            {
                break;
            }
            cur = cur.next.next;
        }
        return dum.next;
    }
}