class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Loop until one of the lists becomes empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // Append the remaining nodes of the non-empty list
        current.next = (list1 != null) ? list1 : list2;
        
        // Return the actual head of the merged list
        return dummy.next;
    }
}