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
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while(cur != null)
        {
            n++;
            cur = cur.next;
        }
        int ans [] = new int[n];
        int a[] = new int[n];
        int k = 0;
        cur = head;
        while(cur != null)
        {
            a[k++] = cur.val;
            cur = cur.next;
        }
        
        for(int i = 0;i<n;i++)
        {    ans[i] = 0;
            for(int j = i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    ans[i] = a[j];
                    break;
                }
            }
             
            
        }
      return ans;
    }
}