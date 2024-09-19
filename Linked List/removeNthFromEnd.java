// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Link - https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      //using two pointer approach
        ListNode fast = head;
        ListNode slow = head;

        while(n-- > 0) fast = fast.next;
        //if fast is null that means we have to remove the head node as we have to conunt nth node from the end.
        if(fast == null) return head.next;

      //moving pointer to one step ahead so that we can travese to the end and our slow pointer should reach to the desired place.
        fast = fast.next;
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

      //assigning the value of next to next node so that.
        slow.next = slow.next.next;
        return head;  
    }
}
