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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode cur = head;
        int i = 1;
        while(cur != null)
        {    
            i++;
            cur = cur.next;
        }
        int a[] = new int[i];
        cur = head;
        int j = 1;
        while(cur != null)
        {
            a[j++] = cur.val;
            cur = cur.next;
        }
        while(left<right)
        {
            int t = a[left];
            a[left] = a[right];
            a[right] = t;
            left++;
            right--;
        }
        cur = head;
        j = 1;
        while(cur != null)
        {
            cur.val = a[j++];
            cur = cur.next;
        }
      return head;
    }
}