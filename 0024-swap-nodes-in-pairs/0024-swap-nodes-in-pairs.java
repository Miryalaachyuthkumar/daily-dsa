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
    public ListNode swapPairs(ListNode head) {
        if(head == null)
        {
            return head;
        }
        ListNode cur = head;
        int n = 0;
        while(cur != null)
        {
            n++;
            cur = cur.next;
        }
        int a[] = new int[n+1];
        cur = head;
        int i = 1;
        while(cur != null)
        {
            a[i++] = cur.val;
            cur = cur.next;
        }
        for(int j = 1;j<n;j+=2)
        {
            int t = a[j];
            a[j] = a[j+1];
            a[j+1] =  t;
        }
        i = 1;
        cur = head;
        while(cur != null)
        {
            cur.val = a[i++];
            cur = cur.next;
        }
 return head;
    }
}