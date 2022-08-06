package Day6;

public class FindIntersectionOfTwoLL {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;


        // assign 2dummyNode dummyA is headOf first LL & b is HeadOf 2nd LL
        ListNode dummyA = headA;
        ListNode dummyB = headB;

        // if dummyA & dummyB have different len , mane 2ta aksathe e colbe
        // jodi akta arekta theke durotto boro ba choto hoye jay tahole
        // intersection point ye  jaiya 2ta milbe
        while (dummyA != dummyB) {
            // for the end of first iteration, we just reset the pointer to the head of another LL

            // jodi dummyA null hoy tahole ata direct 2nd dummyNode r head point korbe
            // and dummyB r khetre o same
            dummyA = dummyA == null ? headB : dummyA.next;
            dummyB = dummyB == null ? headA : dummyB.next;


        }

        // if there is intersection point i can return as dummyA or dummyB
        // if there isn't that also return dummyA cause there intersection will be null

        return dummyA;
    }
}
