package Logic_Building;

import Logic_Building.Logics.NumberPallindrome;
import Logic_Building.Logics.StringPallindrome;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberPallindrome numPal = new NumberPallindrome(1221);
        StringPallindrome strPal = new StringPallindrome("yeah");

        while (true) {
            System.out.println("____________________________");
            System.out.println("MENU");
            System.out.println("1. NUMBER PALINDROME");
            System.out.println("2. STRING PALINDROME");
            System.out.println("3. EXIT");
            System.out.println("____________________________");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    boolean numResult = numPal.isPallindrome();
                    System.out.println("Is palindrome? -> " + numResult);
                    break;
                case 2:
                    boolean strResult = strPal.isPallindrome();
                    System.out.println("Is palindrome? -> " + strResult);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}