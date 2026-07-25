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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
         HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        ListNode t = head;
        ListNode li = new ListNode(0);
        ListNode tai = li;
          t = head;
          while(t!=null)
          {
            if(!set.contains(t.val))
            {
                tai.next = new ListNode(t.val);
                tai = tai.next;
            }
            t = t.next;
          }
          return li.next;
    }
}