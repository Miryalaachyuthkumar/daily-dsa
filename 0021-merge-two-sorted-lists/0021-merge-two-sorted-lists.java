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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        int n = 0;
        while(cur1 != null)
        {
            n++;
            cur1 = cur1.next;
        }
        ListNode cur2 = list2;
        int m = 0;
        while(cur2 != null)
        {
            m++;
            cur2 = cur2.next;
        }
        int a[] = new int[m+n];
        int i = 0;
        cur1 = list1;
        while(cur1 != null)
        {
            a[i++] = cur1.val;
            cur1 = cur1.next;
        }
        cur2 = list2;
        while(cur2 != null)
        {
            a[i++] = cur2.val;
            cur2 = cur2.next;
        }
        Arrays.sort(a);
        ListNode head = new ListNode(0);
        ListNode tail = head;
        for(int j = 0;j<m+n;j++)
        {
            tail.next = new ListNode(a[j]);
            tail = tail.next;
        }
        return head.next;
    }
}