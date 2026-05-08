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
                slow=slow.next;
                fast=fast.next.next;
                if(pre.next.next==slow)
                {
                    pre=pre.next;
                }
            }
        //    ListNode pre=head;
           ListNode after=slow.next;
        //    while(pre.next!=slow)
        //    {
        //     pre=pre.next;
        //    }
           pre.next=after;

            return head;
        }
    }
}