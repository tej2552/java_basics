package Challenge;

import java.util.*;

public class ArrayUtils {

    int max, min;
    Scanner sc = new Scanner(System.in);

    public int largestElementInArray(int[] arr){
        if(arr.length == 0){
            System.out.println("Array doesn't exist");
        }else{
            max = arr[0];
            for (int j : arr){
                if(j > max){
                    max = j;
                }
            }
        }

        return max;
    }

    public int smallestElementInArray(int[] arr){
        if(arr.length == 0){
            System.out.println("Array doesn't exist");
        }else{
            min = arr[0];
            for (int j : arr){
                if(j < min){
                    min = j;
                }
            }
        }

        return min;
    }

    public int[] createArray(){
        System.out.println("Enter the number of elements u want");
        int number = sc.nextInt();

        int[] arr = new int[number];

        for(int i = 0 ; i < number ; i++){
            System.out.println("Enter the number : ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        return arr;
    }

    public int sumOfEleInArray(int [] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        return sum;
    }

    public void displayArray(int[] arr){
        System.out.println(".............................");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("index ["+i+"] -> "+arr[i]);
        }
        System.out.println(".............................");
    }

    public int sumExcluding(String flag, int[] arr){

        int max = this.largestElementInArray(arr);
        int min = this.smallestElementInArray(arr);
        int total = this.sumOfEleInArray(arr);

        if(flag.equalsIgnoreCase("max")){
            return total - max;
        } else if(flag.equalsIgnoreCase("min")){
            return total - min;
        } else if(flag.equalsIgnoreCase("both")){
            return total - (max + min);
        } else {
            throw new IllegalArgumentException("Invalid flag bro! "+flag);
        }
    }

    public void displayInReverse(int[] arr){
        System.out.println(".............................");
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            System.out.println("index ["+i+"] -> "+arr[i]);
        }
        System.out.println(".............................");
    }

    public void actuallyReverseTheArray(int[] arr){
        int left = 0, temp, right = arr.length-1;

        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public void reverseTwoElements(int pos1, int pos2, int[] arr){
        int temp, posTemp;

        if (arr == null || pos1 < 0 || pos2 < 0 || pos1 >= arr.length || pos2 >= arr.length) {
            System.out.println("Invalid positions or array.");
            return;
        }

        if(pos1 > pos2){
            posTemp = pos1;
            pos1 = pos2;
            pos2 = posTemp;
        }

         temp = arr[pos1];
         arr[pos1] = arr[pos2];
         arr[pos2] = temp;
    }

    public void rotateTheArray(int[] arr, int k){

        if(k < 0 || k > arr.length){
            throw new IllegalArgumentException("Wrong deciding positions passed, you can pass only between 0 and "+(arr.length-1));
        }

        k %= arr.length;

        int lastPersistantIndex = (arr.length-1) - k;

        int[] newArray = new int[arr.length];
        int index = 0;

        for(int j = lastPersistantIndex + 1 ; j <= arr.length-1 ; j++){
            newArray[index] = arr[j];
            index++;
        }

        for(int i = 0 ; i <= lastPersistantIndex ; i++){
            newArray[index] = arr[i];
            index++;
        }

        System.out.println("Rotated Array - > "+Arrays.toString(newArray));
    }

    public void sumOfSubArray(int [] arr){
        int i;
        int [] newArr = new int[arr.length];

        for(int k = 0 ; k < arr.length ; k++){
            i = k;
            int sum =0;
            for(int j = 0 ; j <= i ; j++){
                sum += arr[j];
            }
            newArr[k] = sum;
        }

        System.out.println(Arrays.toString(newArr));
    }

    public void sortArray(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1 ; j <= arr.length-1 ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("SORTED ARRAY IS -> "+Arrays.toString(arr));
    }

    public int[] sumToTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public void countFrequencyOfAllElements(int[] arr){

        HashMap<Integer, Integer> frequencies = new HashMap<>();


        for(int i = 0 ; i <= arr.length-1 ; i++){
            int count = 0;
            if(frequencies.containsKey(arr[i])){
                frequencies.put(arr[i], frequencies.get(arr[i])+1);
            }else{
                frequencies.put(arr[i], ++count);
            }

        }

        System.out.println("Frequencies of each element -> "+frequencies);
    }

    public void countAllPairsWithTargetSum(int[] arr, int target){
        Set<ArrayList<Integer>> listOfPairs = new HashSet<>();

        for(int i = 0 ; i < arr.length-1 ; i++){
            int a = arr[i];
            for(int j = i+1 ; j <= arr.length-1 ; j++){
                int b = arr[j];
                int sum = a+b;
                if(sum == target){
                    ArrayList<Integer> pairs = new ArrayList<>();
                    pairs.add(a);
                    pairs.add(b);
                    listOfPairs.add(pairs);
                }
            }
        }


        System.out.println("List of pairs - > " +listOfPairs);
        System.out.println("Total number of pairs - > "+listOfPairs.size());
    }

    public void listSumPairsLessThanTarget(int[] arr, int target){
        Set<ArrayList<Integer>> listOfPairs = new HashSet<>();

        for(int i = 0 ; i < arr.length-1 ; i++){
            int a = arr[i];
            for(int j = i+1 ; j <= arr.length-1 ; j++){
                int b = arr[j];
                int sum = a + b ;
                if(sum < target){
                    ArrayList<Integer> pairs = new ArrayList<>();
                    pairs.add(a);
                    pairs.add(b);
                    listOfPairs.add(pairs);
                }
            }

        }

        System.out.println("Pairs having sum less than ur number - > "+listOfPairs);
        System.out.println("Total number of pairs - > "+listOfPairs.size());
    }

    public void largestSumOfContiguousSubArray(int[] arr, int k){

        int sum = 0;
        for(int i = 0 ; i <= arr.length-k ; i++){
            int loopSum = 0;
            for(int j = i ; j < i+k ; j++){
                loopSum += arr[j];
            }

            if(loopSum > sum){
                sum = loopSum;
            }
        }

        System.out.println("Largest subarray sum is - > "+sum);

    }
}
