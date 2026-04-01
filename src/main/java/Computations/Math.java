package Computations;

import Computations.components.Add;
import Computations.components.Subtract;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("____________________");
            System.out.println("1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. EXIT");
            System.out.println("____________________");


            choice = sc.nextInt();

            switch (choice){
                case 1:
                    Add add = new Add(1,2);
                    System.out.println("RESULT : "+add.doMath());
                    break;
                case 2:
                    Subtract sub = new Subtract(3,4);
                    System.out.println("RESULT : "+sub.doMath());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice bro!");
            }
        }
    }
}
