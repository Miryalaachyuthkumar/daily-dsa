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
    public boolean isPalindrome(ListNode head) {
    
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
        int i = 0,j=n-1;
        while(i<=j)
        {
            if(a[i] != a[j])
            {
            
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}