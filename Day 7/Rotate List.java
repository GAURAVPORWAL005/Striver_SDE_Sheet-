
// Brute force Approach
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        for(int i=0;i<k;i++){
            ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
            ListNode ptr = temp.next;
        
            temp.next = null;
            ptr.next = head;
            head = ptr;
        
    }
        return head;
    }
}
// Time complexity => O(k*n)
