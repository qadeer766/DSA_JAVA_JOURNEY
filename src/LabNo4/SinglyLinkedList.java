package LabNo4;

public class SinglyLinkedList {
    private Node head;     // dummy head node
    private Node tail;     // last node
    private Node prev_x;   // previous pointer
    private Node x;        // current pointer

    // constructor
    public SinglyLinkedList(){
        head = new Node();     // dummy node (not real data)
        tail = head;           // initially tail = head
        x = head;              // traversal pointer
        prev_x = head;         // previous pointer
    }

    // move pointers forward
    public void move(){
        prev_x = x;            // store previous node
        x = x.getNext();       // move to next node
    }

    // append node at end
    public void append(int val) {
        Node n = new Node(val); // create new node
        tail.setNext(n);        // link last node to new node
        tail = n;               // update tail
        System.out.print("Appended Successfully..!\n");
    }

    // search a value
    public boolean search(int val){
        x = head.getNext();    // start from first real node
        prev_x = head;         // previous starts at head
        int loc = 0;           // index counter

        while(x != null){      // traverse till end
            if(x.getData() == val){
                System.out.println("Found at location: " + loc);
                return true;
            } else {
                loc++;         // increase index
                move();        // move forward
            }
        }

        System.out.println("Number not found");
        return false;
    }

    // delete a node
    public void delete(int val){
        if(search(val)){                 // find node first
            prev_x.setNext(x.getNext()); // skip node
            if(x == tail){               // if last node deleted
                tail = prev_x;           // update tail
            }
            x = x.getNext();             // move pointer
            System.out.println("Deleted successfully...");
        }
    }

    // display list
    public void display(){
        x = head.getNext();              // start from first node
        System.out.println("Linked list:");

        while(x != null){                // traverse till end
            System.out.println(x.getData()); // print data (FIXED)
            x = x.getNext();             // move forward
        }
    }

    // insert d1 after d2
    public void insert_after(int d1, int d2){
        if(search(d2)){                  // find node d2
            Node nn = new Node(d1);      // new node
            nn.setNext(x.getNext());     // link new node
            x.setNext(nn);               // attach after d2

            if(x == tail){               // if inserted at end
                tail = nn;               // update tail
            }

            System.out.println("Inserted successfully..");
        }
    }
}npx neonctl@latest init