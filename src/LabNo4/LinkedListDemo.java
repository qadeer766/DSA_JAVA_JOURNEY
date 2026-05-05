package LabNo4;

import java.util.Scanner;

public class LinkedListDemo {
    static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        int opt;
        int val;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("0.Append");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Search");
            System.out.println("4.Display");
            System.out.println("5. Quit");
            System.out.println("Select an Opertation: ");
            opt = input.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Enter number to be appended: ");
                    val = input.nextInt();
                    llist.append(val);
                    break;
                case 1:
                    System.out.println("Enter number to be inseted: ");
                    val = input.nextInt();
                    System.out.println("Enter the number after which you want to insert: ");
                    int loc = input.nextInt();
                    llist.insert_after(val, loc);
                    break;
                case 2:
                    System.out.println("Enter number to be deleted: ");
                    val = input.nextInt();
                    llist.delete(val);
                    break;
                case 3:
                    System.out.println("Enter number to be searched: ");
                    val = input.nextInt();
                    llist.search(val);
                    break;
                case 4:
                    llist.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice\n");

            }
        }
        while (opt !=5);

    }
}
