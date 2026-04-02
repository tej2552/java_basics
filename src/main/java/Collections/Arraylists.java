package Collections;

import Collections.Interfaces.Operations;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists implements Operations {

    private final ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void insert(int num) {
        list.add(num);
    }

    @Override
    public void deleteByValue(int value) {
        list.remove(Integer.valueOf(value));
    }

    public void deleteByIndex(int index){
        list.remove(index);
    }

    @Override
    public void modify(int index, int ele) {
        list.set(index, ele);
    }

    @Override
    public void display() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        Arraylists myList = new Arraylists();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("MENU");
            System.out.println("____________________");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Modify");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("____________________");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the number u want to add");
                    int num = sc.nextInt();
                    myList.insert(num);
                    break;
                case 2:
                    System.out.println("What do you want to reference it to remove - Index / Value itself (object)");
                    String decision = sc.next();
                    if(decision.equalsIgnoreCase("index")){
                        System.out.println("Enter the index from which you want to delete");
                        int index = sc.nextInt();
                        myList.deleteByIndex(index);
                    }else if(decision.equalsIgnoreCase("value")){
                        System.out.println("Enter the value which you want to delete");
                        int value = sc.nextInt();
                        myList.deleteByValue(value);
                    }else{
                        System.out.println("Wrong choice..........");
                    }
                    break;
                case 3:
                    System.out.println("Enter the index where you want to modify");
                    int ind = sc.nextInt();
                    System.out.println("Enter the number you want in place of the old value at the index"+ind);
                    int n = sc.nextInt();
                    myList.modify(ind,n);
                    break;
                case 4:
                    myList.display();
                    break;
                case 5:
                    System.out.println("Bye........");
                    return;
                default:
                    System.out.println("Nah bro!");
                    break;
            }

        }
    }
}
