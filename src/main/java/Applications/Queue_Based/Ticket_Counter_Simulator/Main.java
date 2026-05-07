package Applications.Queue_Based.Ticket_Counter_Simulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("        Welcome to Ticket Counter");
        System.out.println("    First Come, First Served (FIFO)");
        System.out.println("==============================================");

        while (true) {
            System.out.println();
            System.out.println("Choose an operation:");
            System.out.println("1. Add person to queue");
            System.out.println("2. Give ticket to front person");
            System.out.println("3. Show front person");
            System.out.println("4. Show total people waiting");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter person ID: ");
                    int id = sc.nextInt();
                    app.addPersonToTheQueue(id);
                    System.out.println("Person with ID " + id + " joined the queue.");
                    break;

                case 2:
                    int served = app.giveTicket();
                    if (served == -1) {
                        System.out.println("Queue is empty. No one to serve.");
                    } else {
                        System.out.println("Ticket given to person with ID " + served + ".");
                    }
                    break;

                case 3:
                    int front = app.showFrontCustomer();
                    if (front == -1) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Person at the front is ID " + front + ".");
                    }
                    break;

                case 4:
                    System.out.println("Total people waiting: " + app.showCustomerQueueCount());
                    break;

                case 5:
                    System.out.println("Closing ticket counter. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}