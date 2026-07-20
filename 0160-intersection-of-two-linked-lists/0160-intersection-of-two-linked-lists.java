/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        int l = 0,c=0;
        while(cur1!=null)
        {
             l++;
             cur1 = cur1.next;
        }
        while(cur2 != null)
        {
            c++;
            cur2 = cur2.next;
        }
        int dif = Math.abs(l-c);
        cur1 = headA;
        cur2 = headB;
        
        if(l>c)
        { 
            
            while(dif>0)
            {
                cur1 = cur1.next;
                 dif--;    
            }
           
        }
        if(l<c)
        {
            
            while(dif>0)
            {
                cur2 = cur2.next;
                dif--;
            }
        }
        while(cur1 != null && cur2 != null)
        {
            if(cur1 == cur2)
            {
                return cur1;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return null;
    }
}