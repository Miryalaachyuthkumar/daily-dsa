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
    public void reorderList(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while(cur != null)
        {
            n++;
            cur = cur.next;
        }
        int a[] = new int[n];
        int l = 0;
        cur = head;
        while(cur != null)
        {
            a[l++] = cur.val;
            cur = cur.next;
        }
        int ans[] = new int[n];
        int k = 0;
        int i = 0,j=n-1;
        while(k<n && i<=j)
        {
            if(k%2 == 0)
            {
                ans[k++] = a[i++]; 
            }else
            {
                ans[k++] = a[j--];
            }
            
        }
        
        cur = head;
         l = 0;
         while(cur != null)
         {
            cur.val = ans[l++];
            cur = cur.next;
         }
         
    }
}