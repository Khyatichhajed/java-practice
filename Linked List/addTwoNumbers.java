// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Link - https://leetcode.com/problems/add-two-numbers/description/

class Solution {
    public ListNode AddTwoNumbers(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode temp = res;
        int carry = 0;
        while(list1 != null || list2 != null){
            //if node is null assgining value as zero else mode's value.
            int first = list1 != null ? list1.val : 0;
            int second = list2 != null ? list2.val : 0;

            temp.next = new ListNode((first + second + carry) % 10);
            carry = (first + second + carry) / 10;
            temp = temp.next;

          //checking whether the next node is present or not. If present moving point to next node else assigning as null.
            list1 = list1 != null ? list1.next : null;
            list2 = list2 != null ? list2.next : null;
        }
      //checking if we have any extra elememt left or not.
        if(carry > 0){
            temp.next = new ListNode(carry);
        }

        return res.next;
    }
}
