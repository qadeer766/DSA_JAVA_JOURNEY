package DoublyLinkedList2;

public class doublylinkedlist {
    Node head;

    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

    }

    // delete first node
    void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node temp = head;
        While(temp.next != null){
            temp = temp.next;
        }

        temp.prev.next = null;
    }


}
