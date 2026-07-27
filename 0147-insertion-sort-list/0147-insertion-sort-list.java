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
    public ListNode insertionSortList(ListNode head) {
        ListNode cur = head;
        int n = 0;
        while(cur != null)
        {
            n++;
            cur = cur.next;
        }
        int a[] = new int [n];
        int i = 0;
        cur = head;
        while(cur != null)
        {
            a[i++] = cur.val;
            cur = cur.next;
        }
        Arrays.sort(a);
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