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
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while(cur!=null)
        {
            sb.append(cur.val);
            cur = cur.next;
        }
        int decimal = Integer.parseInt(sb.toString(), 2);
        return decimal; 
    }
}