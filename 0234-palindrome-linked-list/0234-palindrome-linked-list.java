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
    public boolean isPalindrome(ListNode head) {    // using stack
        Stack<ListNode> reverse=new Stack<>();
        ListNode rev=head;
        while(rev!=null)
        {
            reverse.push(rev);
            rev=rev.next;
        }

        //match list with is reverse which is stored in stack

        while(head!=null && !reverse.isEmpty())
        {
            if(reverse.pop().val!=head.val)
            {
                return false;
            }
            else
            {
                head=head.next;
            }
        }
        return true;
    }
}