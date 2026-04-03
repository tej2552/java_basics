package Challenge;

import java.util.Objects;
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        final ArrayUtils utils = new ArrayUtils();
        final Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements u want");
        int number = sc.nextInt();

        int[] arr = new int[number];

        for(int i = 0 ; i < number ; i++){
            System.out.println("Enter the number : ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        while (true){
            System.out.println("______________________________");
            System.out.println("What do you want -> ");
            System.out.println("1. Max");
            System.out.println("2. Min");
            System.out.println("3. Sum");
            System.out.println("4. Show Array");
            System.out.println("5. Sum excluding Max / Min");
            System.out.println("6. Reverse the array");
            System.out.println("7. Reverse 2 elements in the array");
            System.out.println("8. Rotate the array");
            System.out.println("9. Sum of sub array in each element position");
            System.out.println("10. Nothing -> Just Exit");
            System.out.println("______________________________");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Max in the array - > "+utils.largestElementInArray(arr));
                    break;
                case 2:
                    System.out.println("Min in the array - > "+utils.smallestElementInArray(arr));
                    break;
                case 3:
                    System.out.println("Sum of all elements in the array - > "+utils.sumOfEleInArray(arr));
                    break;
                case 4:
                    utils.displayArray(arr);
                    break;
                case 5:
                    System.out.println("Hey, what do you want to exclude ? ");
                    String ch = sc.next();
                    System.out.println("Sum excluding "+ch+": "+utils.sumExcluding(ch,arr));
                    break;
                case 6:
                    System.out.println("Do u just want to see the array in reverse way or actually reverse it ?");
                    String decision = sc.next();
                    if(Objects.equals(decision, "see")){
                        utils.displayInReverse(arr);
                    } else if (Objects.equals(decision, "reverse")) {
                        utils.actuallyReverseTheArray(arr);
                        utils.displayArray(arr);
                    }
                    break;
                case 7:
                    System.out.println("Enter the 2 positions : ");
                    int pos1 = sc.nextInt();
                    int pos2 = sc.nextInt();
                    utils.reverseTwoElements(pos1, pos2, arr);
                    System.out.println("Reversed, please select the display option to verify");
                    break;
                case 8:
                    System.out.println("By how many positions do u want to rotate the array ?");
                    int positions = sc.nextInt();
                    utils.rotateTheArray(arr, positions);
                    break;
                case 9:
                    utils.sumOfSubArray(arr);
                    break;
                case 10:
                    System.out.println("OK prend bye....");
                    sc.close();
                    return;
                default:
                    System.out.println("Look at the menu and choose a valid option");
                    break;
            }
        }
    }
}
