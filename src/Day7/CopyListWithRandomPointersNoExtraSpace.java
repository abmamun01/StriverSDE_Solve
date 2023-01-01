/*
package Day7;

public class CopyListWithRandomPointersNoExtraSpace {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

*/
/*    public Node copyList(Node head) {
        Node temp = head;
        // jate temp k samne barale o location thik thake , tai next use korechi
        Node next = head.next;
        while (temp != null) {

            Node copy = new Node(temp.val);
            // temp r next jora dibo
            temp.next = copy;
            // now temp will become n
            temp = next;
            //next will become next.next
            if (next != null) next = next.next;
        }
    }*//*


    void handleRandom(Node head) {
        Node temp = head;
        while (temp!=null){
            // temp j next seta holo copy of temp

        }
    }

    Node copyRandomList(Node head) {
        //base case
        if (head == null) return null;
        copyList(head);
    }
}
*/
