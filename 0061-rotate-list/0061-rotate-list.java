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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
        {
            return head;
        }
        int n = 0;
        ListNode cur = head;
        while(cur != null)
        {
            n++;
            cur = cur.next;

        }
        int r = k%n;
        if(r == 0)
        {
            return head;
        }
        cur = head;
        for(int i = 1;i<n-r;i++)
        {
            cur = cur.next;
        }
        ListNode te = head;
        while(te.next != null)
        {
            te = te.next;
        }
        ListNode o = head;
        ListNode nhead = cur.next;
        cur.next = null;
        te.next = o;
   return nhead;
    }
}