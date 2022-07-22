package Day5;

public class ReverseLinkedList {

    public class ListNode {
        int node;
        ListNode next;

        ListNode() {
        }

        ListNode(int node) {
            this.node = node;
        }

        ListNode(int node, ListNode next) {
            this.node = node;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {


        ListNode dummyNode = null;

        while (head != null) {
            // present node r next jeta ache
            ListNode nextNode = head.next;
            // current node r next banabo prev node k
            head.next = dummyNode;


            // update
            dummyNode = head;
            head = nextNode;
        }

        return dummyNode;
    }


}
