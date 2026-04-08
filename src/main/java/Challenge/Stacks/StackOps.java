package Challenge.Stacks;

import java.util.Stack;

public class StackOps {

    Stack<Integer> numStack = new Stack<>();

    public void addNumber(int num){
        numStack.push(num);
    }

    public int removeLastNumber(){
        return numStack.pop();
    }

    public int showLastElement(){
        return numStack.peek();
    }

    public boolean isStackEmpty(){
        return numStack.isEmpty();
    }

    public void showStack(){
        for (Integer integer : numStack) {
            System.out.println(integer);
        }
//        or
//        for (int i = 0; i < numStack.size(); i++) {
//            System.out.println(numStack.get(i));
//        }
    }
}
