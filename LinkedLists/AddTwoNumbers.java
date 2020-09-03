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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode node_l1 = l1;
        ListNode node_l2 = l2;
        ListNode current = dummyNode;
        int carry = 0;
        
        while(node_l1 != null || node_l2 != null) {
            int x = (node_l1 != null) ? node_l1.val : 0;
            int y = (node_l2 != null) ? node_l2.val : 0;
            int sum = carry + x + y;
            current.next = new ListNode(sum % 10);
            carry = sum/10; // 1 or 0
            
            current = current.next;
            if(node_l1 != null) node_l1 = node_l1.next;
            if(node_l2 != null) node_l2 = node_l2.next;
        }
        if(carry>0) {
            current.next = new ListNode(carry); 
        }
        
        return dummyNode.next;
    }
}