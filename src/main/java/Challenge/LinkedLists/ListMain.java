package Challenge.LinkedLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many lists
        System.out.print("How many linked lists do you want? ");
        int n = sc.nextInt();

        // Create n linked lists
        ArrayList<Node> heads = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            heads.add(null); // initialize empty heads
        }

        LLUtils listOps = new LLUtils();

        while (true) {
            System.out.println("\n_________________________");
            System.out.println("MENU");
            System.out.println("1. Insert at end");
            System.out.println("2. Insert at beginning");
            System.out.println("3. Print list");
            System.out.println("4. Reverse the linked list");
            System.out.println("5. Merge lists");
            System.out.println("6. Exit");
            System.out.println("_________________________");

            System.out.print("Choose operation: ");
            int ch = sc.nextInt();

            if (ch == 6) {
                System.out.println("Ok bro!!!! bye...");
                break;
            }

            System.out.print("Choose list (1 to " + n + ", or 0 for ALL): ");
            int listChoice = sc.nextInt() - 1;

            switch (ch) {

                case 1:
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();

                    if (listChoice == -1) { // ALL
                        for (int i = 0; i < n; i++) {
                            Node head = heads.get(i);
                            head = listOps.insertAtEnd(head, num);
                            heads.set(i, head);
                        }
                    } else {
                        Node head = heads.get(listChoice);
                        head = listOps.insertAtEnd(head, num);
                        heads.set(listChoice, head);
                    }
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int nval = sc.nextInt();

                    if (listChoice == -1) { // ALL
                        for (int i = 0; i < n; i++) {
                            Node head = heads.get(i);
                            head = listOps.insertAtBeg(head, nval);
                            heads.set(i, head);
                        }
                    } else {
                        Node head = heads.get(listChoice);
                        head = listOps.insertAtBeg(head, nval);
                        heads.set(listChoice, head);
                    }
                    break;

                case 3:
                    if (listChoice == -1) { // ALL
                        for (int i = 0; i < n; i++) {
                            System.out.print("List " + (i + 1) + ": ");
                            listOps.printList(heads.get(i));
                        }
                    } else {
                        System.out.print("List " + (listChoice + 1) + ": ");
                        listOps.printList(heads.get(listChoice));
                    }
                    break;

                case 4:
                    if (listChoice == -1) { // ALL
                        for (int i = 0; i < n; i++) {
                            Node head = heads.get(i);
                            head = listOps.reverseLinkedList(head);
                            heads.set(i, head);
                        }
                        System.out.println("All lists reversed");
                    } else {
                        Node head = heads.get(listChoice);
                        head = listOps.reverseLinkedList(head);
                        heads.set(listChoice, head);
                        System.out.println("List " + (listChoice + 1) + " reversed");
                    }
                    break;

                case 5:
                    listOps.mergeLists(heads);
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }

        sc.close();
    }
}