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
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while(cur != null)
        {
            n++;
            cur = cur.next;
        }
        int a[] = new int[n];
        int  i = 0;
        cur = head;
        while(cur != null)
        {
            a[i++] = cur.val;
            cur = cur.next;
        }
        int max = Integer.MIN_VALUE;
        int j = 0,k=n-1;
        while(j<k)
        {
            int sum = 0;
            sum = a[j]+a[k];
            max = Math.max(sum,max);
            j++;
            k--;
        }
        return max;
    }
}