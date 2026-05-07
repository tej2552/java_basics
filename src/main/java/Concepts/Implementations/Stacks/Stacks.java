package Concepts.Implementations.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Stacks {

    //This section covers how we can implement stack to array problems,
    // and use just 1 loop instead of 2 to reduce time complexity

    public int[] firstGreaterElementToRight(int[] arr){
        Stack<Integer> first = new Stack<>();
        int[] res = new int[arr.length];
        Arrays.fill(res, -1);

        for(int i = 0 ; i < arr.length ; i++){
            while(!first.isEmpty() && arr[i] > arr[first.peek()]){
                res[first.pop()] = arr[i];
            }

            first.push(i);
        }

        return res;
    }

    public int[] secondGreaterElementToRight(int[] arr){
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();

        int[] res = new int[arr.length];
        Arrays.fill(res, -1);

        for(int i = 0 ; i < arr.length ; i++){

            Stack<Integer> temp = new Stack<>();

            while(!second.isEmpty() && arr[i] > arr[second.peek()]){
                res[second.pop()] = arr[i];
            }

            while(!first.isEmpty() && arr[i] > arr[first.peek()]){
                temp.push(first.pop());
            }

            while(!temp.isEmpty()){
                second.push(temp.pop());
            }

            first.push(i);
        }

        return res;
    }

    public int[] showDiffWithFirstGreaterElement(int[] arr){
        Stack<Integer> first = new Stack<>();
        int[] res = new int[arr.length];
        Arrays.fill(res, 0);

        for(int i = 0 ; i < arr.length ; i++){

            while(!first.isEmpty() && arr[i] > arr[first.peek()]){
                int index = first.pop();
                res[index] = arr[i] - arr[index];
            }

            first.push(i);
        }

        return res;
    }

    public boolean validateParenthesis(String str){

        Stack<Character> brackets = new Stack<>();

        if(str.isEmpty()){
            return false;
        }

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                brackets.push(ch);
            } else {
                if (brackets.isEmpty()) {
                    return false;
                }

                char top = brackets.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }

    //This is a comprehensive solution for handling real time stack and finding min in the stack
    Stack<Integer> nums = new Stack<>();
    Stack<Integer> mins = new Stack<>();

    public int removedElement() {
        int remEle = 0;

        try{
            remEle = nums.pop();
            if(remEle == mins.peek()){
                mins.pop();
            }
        }catch (Exception e){
            System.out.println("ERROR -> "+e.getMessage());
        }

        return remEle;

    }

    public void addElement(int n){
        nums.push(n);
        if(mins.isEmpty()){
            mins.push(n);
        }else {
            if(nums.isEmpty() || n <= mins.peek()) {
                mins.push(n);
            }
        }
    }

    public int showTopEle(){
        return nums.peek();
    }

    public int showMin(){
        return mins.peek();
    }

}
