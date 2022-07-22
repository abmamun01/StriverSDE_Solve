package Day5;

import java.util.List;

public class MergeTwoSortedLL {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // list1 is small
        // list 2 is bigger

        // iterative
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // jodi small list1 boro hoy list 2 theke
        if (list1.val > list2.val) {
            // swap l1 with l2
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        // initially we kept our result to list1
        ListNode res = list1;
        while (list1 != null && list2 != null) {
            ListNode temp = null;
            // jotokhon list1 null na hoy and list1 value list2 theke choto na hoy
            // temp will be pointer to the last node which is smaller one
            while (list1 != null && list1.val <= list2.val) {
                // to remember which one was the last node
                temp = list1;
                list1 = list1.next;
            }
            temp.next = list2;

            // swap
            ListNode temp2 = list1;
            list1 = list2;
            list2 = temp2;
        }
        return res;

    }

}
