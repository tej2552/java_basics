package Challenge.Stacks;

import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        StackOps stackOps = new StackOps();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("_______________________");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is stack empty");
            System.out.println("5. Show stack");
            System.out.println("6. Exit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter the number");
                    int num = sc.nextInt();
                    stackOps.addNumber(num);
                    break;
                case 2:
                    System.out.println(stackOps.removeLastNumber());
                    break;
                case 3:
                    System.out.println(stackOps.showLastElement());
                    break;
                case 4:
                    if(stackOps.isStackEmpty()){
                        System.out.println("Yes");
                    }else {
                        System.out.println("Nah!");
                    }
                    break;
                case 5:
                    stackOps.showStack();
                    break;
                case 6:
                    System.out.println("Noiceee");
                    return;
                default:
                    System.out.println("Choose correctly idiot");
                    break;

            }
        }
    }
}
