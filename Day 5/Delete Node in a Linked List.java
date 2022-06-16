// QUestion => https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/
// we directly move to that node and assign the value to node as the next value and make node.next to node.next.next
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
// Time Complexity => O(1)
