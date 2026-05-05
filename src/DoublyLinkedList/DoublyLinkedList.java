package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;

    // insert at begining
    public void insertAtStart(int data){
        Node newNode = new Node(data);

        if(head != null){
            head.prev = newNode;
            newNode.next = head;
        }

    }
}
