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
               List<Integer> intList = new ArrayList<>();

        if (head == null || head.next == null) {
            return head;
        }

        while (head != null) {
            intList.add(head.val);
            head = head.next;
        }

        int n = intList.size();
        ListNode returnHead = new ListNode(intList.get(n - 1));
        ListNode returnTrav = returnHead;
        for (int i = n - 2; i > -1 ; i--) {
            returnTrav.next = new ListNode(intList.get(i));
            returnTrav = returnTrav.next;
        }

        return returnHead; 
    }
}
