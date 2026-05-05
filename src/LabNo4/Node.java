package LabNo4;

public class Node {
    private int data;      // stores value of node
    private Node next;     // reference to next node

    // 0-argument constructor (for dummy head)
    public Node() {
        this.data = -1;    // default dummy value
        this.next = null;  // no next node
    }

    // 1-argument constructor (for normal node)
    public Node(int val) {
        this.data = val;   // assign value
        this.next = null;  // next is null initially
    }

    // 2-argument constructor (for linking directly)
    public Node(int data, Node next) {
        this.data = data;  // set data
        this.next = next;  // set next reference
    }

    // setter for data
    public void setData(int data) {
        this.data = data;  // update value
    }

    // getter for data
    public int getData() {
        return this.data;  // return value
    }

    // setter for next node
    public void setNext(Node next) {
        this.next = next;  // update next reference
    }

    // getter for next node
    public Node getNext() {
        return this.next;  // return next node
    }
}
