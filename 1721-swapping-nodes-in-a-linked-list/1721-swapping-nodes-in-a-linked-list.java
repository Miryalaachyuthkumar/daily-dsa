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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode beg = head;
        for(int i = 1;i<k;i++)
        {
            beg = beg.next;
        }
         ListNode x = head;
         int n = 0;
         while( x != null)
         {   
            n++;
            x = x.next;
            
         }
        ListNode end = head;
        for(int i = 1;i<n-k+1;i++)
        {
            end = end.next;
        }
        int temp = beg.val;
        beg.val = end.val;
        end.val = temp;
        return head;
    }
}