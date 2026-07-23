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
    public ListNode partition(ListNode head, int x) {
        int n = 0;
        ListNode cur = head;
        while(cur != null)
        {
            n++;
            cur = cur.next;
        }
        
        int a[] = new int[n];
        cur = head;
        int i = 0;
        while(cur != null)
        {
             if(cur.val<x)
             {
                a[i++] = cur.val;
             }
             cur = cur.next;
        }
        cur = head;
        while(cur != null)
        {
             if(cur.val>=x)
             {
                a[i++] = cur.val;
             }
             cur = cur.next;
        }
         cur = head;
         i = 0;
        while(cur != null)
        {
            cur.val = a[i++];
            cur = cur.next;
        }
    return head;
    }
}