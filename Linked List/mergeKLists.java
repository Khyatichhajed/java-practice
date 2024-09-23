// You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
// Merge all the linked-lists into one sorted linked-list and return it.

// Link - https://leetcode.com/problems/merge-k-sorted-lists/description/

class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        
        ListNode temp = lists[0];
    
        for(int i=1;i<lists.length;i++){          
            temp = mergeTwoLists(temp,lists[i]);            
        }
        return temp;
    }

  // Function to Merge two Lists.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 ==null) return list2;
        if(list2 == null) return list1;

        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
