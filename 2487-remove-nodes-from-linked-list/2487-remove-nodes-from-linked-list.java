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
// class Solution {  // my apprach whic is not solving all case;
//     public ListNode removeNodes(ListNode head) {

//         if (head == null || head.next == null) {
//             return head;
//         }

//         ListNode temp = head.next;
//         ListNode pre = head;

//         int maxVal = head.val;

//         while (temp != null) {

//             ListNode after = temp.next;

//             // Current node is greater than everything before it
//             if (temp.val > maxVal) {
//                 head = temp;
//                 pre = temp;
//                 maxVal = temp.val;
//             }

//             // Current node has a greater node immediately after it
//             else if (after != null && temp.val < after.val) {
//                 pre.next = after;
//             }

//             else {
//                 pre = temp;
//             }

//             maxVal = Math.max(maxVal, temp.val);

//             temp = after;
//         }

//         return head;
//     }
// }

class Solution {
    public ListNode removeNodes(ListNode head) {

        // Reverse the list
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

        // Remove nodes smaller than maximum on their right
        int maxVal = head.val;
        curr = head;

        while (curr != null && curr.next != null) {

            if (curr.next.val < maxVal) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                maxVal = curr.val;
            }
        }

        // Reverse again
        prev = null;
        curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}