package Challenge;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Array{
    static int[] arr;

    public static void main(String[] args) {
        final ArrayUtils utils = new ArrayUtils();
        final Scanner sc = new Scanner(System.in);

         arr = utils.createArray();

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
            System.out.println("10. Sort the array");
            System.out.println("11. Create a new array ? Y/N");
            System.out.println("12. Want to find a pair whose sum is equal to your desired number ?");
            System.out.println("13. Check frequencies of each element");
            System.out.println("14. Get the pairs which are equal to ur desired number >");
            System.out.println("15. Get the pairs whose sum is less than ur desired number");
            System.out.println("16. Nothing -> Just Exit");
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
                    utils.sortArray(arr);
                    break;
                case 11:
                    System.out.println("Are you sure - 'the current array will be discarded'");
                    String selection = sc.next();
                    if(selection.equalsIgnoreCase("y")){
                        arr = utils.createArray();
                    }
                    break;
                case 12:
                    System.out.println("Tell me your desired number");
                    System.out.println("NOTE -> Make sure the number you desire should be some sum of numbers in the array");
                    int desNum = sc.nextInt();
                    System.out.println("Is the array sorted ? y/n ");
                    String sorted = sc.next();
                    if(sorted.equalsIgnoreCase("n")){
                        utils.sortArray(arr);
                    }
                    int[] ans = utils.sumToTarget(arr, desNum);
                    System.out.println("Pair -> "+ Arrays.toString(ans));
                    break;
                case 13:
                    utils.countFrequencyOfAllElements(arr);
                    break;
                case 14:
                    System.out.println("What is the number u desire ? ");
                    System.out.println("NOTE -> Make sure the number you desire should be some sum of numbers in the array");
                    int desire = sc.nextInt();
                    utils.countAllPairsWithTargetSum(arr, desire);
                    break;
                case 15:
                    System.out.println("What is the number u desire ? ");
                    System.out.println("NOTE -> Make sure the number you desire should be some sum of numbers in the array");
                    int des = sc.nextInt();
                    utils.listSumPairsLessThanTarget(arr,des);
                    break;
                case 16:
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
