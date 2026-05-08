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
    public ListNode reverseList(ListNode head) {
        // if(head.next==null) return head;
        ListNode pre=null;
        ListNode temp=head;
        ListNode after;

        while(temp!=null)
        {
            after=temp.next;
            temp.next=pre;
            pre=temp;
            temp=after;
        }
        head=pre;
        return head;
    }
}