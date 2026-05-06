package Concepts.Implementations;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stacks stacks = new Stacks();
        Scanner sc = new Scanner(System.in);

        System.out.println("__________STACKS____________");
        System.out.println("______________________________________________________________");

        int[] arr = new int[]{2,4,6,2,7,9};
        System.out.println("ORIGINAL ARRAY - > "+ Arrays.toString(arr));
        System.out.println("First greater element - > "+Arrays.toString(stacks.firstGreaterElementToRight(arr)));
        System.out.println("Second greater element - > "+Arrays.toString(stacks.secondGreaterElementToRight(arr)));

        System.out.println("______________________________________________________________");

        int[] temp = new int[]{74, 75, 77, 78, 76, 71, 70};
        System.out.println("Everyday temperature in a week - > "+Arrays.toString(temp));
        System.out.println("Next greater temperature for the temp of current day is - > "+Arrays.toString(stacks.showDiffWithFirstGreaterElement(temp)));

        System.out.println("______________________________________________________________");

        String str = "{[]}";
        System.out.println("Parenthesis validation for string "+str+" - > "+stacks.validateParenthesis(str));

        System.out.println("______________________________________________________________");

        System.out.println("______________________________________________________________");
        System.out.println("Do you want to play a small stack game : ");
        String dec = sc.next();

        if(dec.equalsIgnoreCase("yes")){
            while(true){
                System.out.println("What do u want to do with the stack");
                System.out.println("1. ADD");
                System.out.println("2. REMOVE");
                System.out.println("3. SHOW TOP");
                System.out.println("4. SHOW MINIMUM ELEMENT IN STACK");
                System.out.println("5. EXIT");

                int choice = sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Give me ur lucky number : ");
                        int num = sc.nextInt();
                        stacks.addElement(num);
                        break;
                    case 2:
                        System.out.println(stacks.removedElement());
                        break;
                    case 3:
                        System.out.println(stacks.showTopEle());
                        break;
                    case 4:
                        System.out.println(stacks.showMin());
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Choose a proper number : )");
                        break;
                }
            }
        }else{
            System.out.println("OK No worries, bye tc");
        }

        System.out.println("______________________________________________________________");

    }
}
