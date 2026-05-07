package Applications.Stack_Based.Elevator;

import Exceptions.ElevatorExceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ElevatorExceptions {
        App app = new App();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("_________________________________________");
            System.out.println("Hello! Lets play elevator elevation");
            System.out.println("What do u wanna do");
            System.out.println("1. Add a person into elevator");
            System.out.println("2. Show the person with highest priority");
            System.out.println("3. Show the person with least priority");
            System.out.println("4. Show who is closest to the elevator door");
            System.out.println("5. Drop out the person who entered last");
            System.out.println("6. Exit");
            System.out.println("_________________________________________");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Tell me the priority of the person");
                    int pr = sc.nextInt();
                    app.addPerson(pr);
                    app.showAllPersonPriority();
                    try {
                        System.out.println("Current highest prioritised person in elevator is -> " + app.showPersonWithHighestPriority());
                    }catch (ElevatorExceptions el){
                        System.out.println(el.getMessage());
                    }
                    break;
                case 2:
                    app.showAllPersonPriority();
                    try {
                        System.out.println("Current highest prioritised person in elevator is -> " + app.showPersonWithHighestPriority());
                    }catch (ElevatorExceptions el){
                        System.out.println(el.getMessage());
                    }
                    break;
                case 3:
                    app.showAllPersonPriority();
                    try {
                        System.out.println("Least priority of a person in the elevator currently is - > " + app.showPersonWithLeastPriority());
                    }catch (ElevatorExceptions el){
                        System.out.println(el.getMessage());
                    }
                    break;
                case 4:
                    app.showAllPersonPriority();
                    System.out.println("Person with priority "+app.showPersonNearToDoor()+" is nearest to door");
                    break;
                case 5:
                    System.out.println("Dropping the person with priority "+app.dropLastPersonEntered());
                    app.showAllPersonPriority();
                    try {
                        System.out.println("Current highest prioritised person in elevator is -> " + app.showPersonWithHighestPriority());
                    }catch (ElevatorExceptions el){
                        System.out.println(el.getMessage());
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Ok thanks for your time");
                    break;
            }
        }
    }
}
