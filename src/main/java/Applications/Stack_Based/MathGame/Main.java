package Applications.Stack_Based.MathGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************************************************************");
        System.out.println("Example - > If your string is something like - 52+CD : This will give you 11");
        System.out.println("**********************************************************************************");

        while (true){
            System.out.println("***************************************");
            System.out.println("Enter the operation you want to do");
            app.showOperationsAllowed();
            System.out.println("***************************************");

            String op = sc.next();

            switch (op){
                case "n":
                    System.out.println("Enter the number");
                    int n = sc.nextInt();
                    app.pushNumber(n);
                    break;
                case "+":
                    int sum = app.getTop(app.data) + app.getTop(app.history);
                    app.pushNumber(sum);
                    break;
                case "c":
                    app.deleteNum();
                    break;
                case "d":
                    int val = app.data.peek() * 2;
                    app.pushNumber(val);
                    break;
                case "t":
                    System.out.println("OUTPUT IS - > "+app.showTotal());
                    return;
                default:
                    System.out.println("Invalid input");
                    break;

            }
        }



    }
}
