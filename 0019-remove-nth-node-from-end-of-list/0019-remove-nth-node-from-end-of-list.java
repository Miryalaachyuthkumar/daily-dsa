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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beg = head;
        int x = 0;
        while(beg != null)
        {
            x++;
            beg = beg.next;
        }
        if(x == n) {
            return head.next;
        }
        beg = head;
        for(int i = 1;i<x-n;i++)
        {
            beg = beg.next;
        }
        beg.next = beg.next.next;
        return head;
    }
}