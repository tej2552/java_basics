package Collections;

import Collections.Interfaces.Operations;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets implements Operations {

    Set<Integer> mySet = new HashSet<>();

    @Override
    public void insert(int num) {
        mySet.add(num);
    }

    @Override
    public void deleteByValue(int value) {
        mySet.remove(value);
    }

    @Override
    public void deleteByIndex(int index) {
        System.out.println("cannot do this in sets bro!");
    }

    public void deleteAll(){
        mySet.clear();
    }

    @Override
    public void modify(int index, int ele) {

    }

    @Override
    public void display() {
        //Hashset doesn't print in the order we entered, it prints in random order
//        System.out.println(mySet); // basic displaying
        mySet.forEach(System.out::println); //lambda expression to display
    }

    public static void main(String[] args) {

        Sets set = new Sets();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("MENU");
            System.out.println("____________________");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Delete all");
            System.out.println("4. Modify");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("____________________");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number : ");
                    int num = sc.nextInt();
                    set.insert(num);
                    break;
                case 2:
                    System.out.println("What do you want to reference it to remove - Index / Value itself (object)");
                    String decision = sc.next();
                    if(decision.equalsIgnoreCase("index")){
                        System.out.println("Enter the index from which you want to delete");
                        int index = sc.nextInt();
                        set.deleteByIndex(index);
                    }else if(decision.equalsIgnoreCase("value")){
                        System.out.println("Enter the value which you want to delete");
                        int value = sc.nextInt();
                        set.deleteByValue(value);
                    }else{
                        System.out.println("Wrong choice..........");
                    }
                    break;
                case 3:
                    set.deleteAll();
                    break;
                case 4:
                    System.out.println("nothing here, go ahead!");
                    break;
                case 5:
                    set.display();
                    break;
                case 6:
                    System.out.println("Bye........");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
