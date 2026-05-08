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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null) return null;
        else if(head.next==null) return null;
        else
        {   ListNode pre=head;
            ListNode slow=head;
           ListNode fast=head;
            while(fast!=null && fast.next!=null)
            {
                pre=slow;
                slow=slow.next;
                fast=fast.next.next;
               
              
            }
           ListNode after=slow.next;
           pre.next=after;
            return head;
        }
    }
}