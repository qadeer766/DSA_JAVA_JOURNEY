package LinkedList;

public class singlyLinkedList {

     Node head;

    singlyLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        head = n1;
        n1.next = n2;
        n2.next = n3;

    }
    public void display() {
        Node p = head;

        while (p != null) {
            System.out.println(
                    "Data: " + p.data +
                            " | Node Ref: " + System.identityHashCode(p) +
                            " | Next Ref: " + (p.next != null ? System.identityHashCode(p.next) : "null")
            );
            p = p.next;
        }
    }
}
