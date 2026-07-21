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
    public ListNode sortList(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while(cur != null)
        {
            n++;
            cur  = cur.next;
        }
        int a[] = new int [n];
        cur = head;
        int l = 0;
        while(cur != null)
        {
            a[l++] = cur.val;
            cur = cur.next;
        }
        Arrays.sort(a);
        cur = head;
        int i = 0;
        while(cur != null)
        {
            cur.val = a[i++];
            cur = cur.next;
        }
        return head;
    }
}