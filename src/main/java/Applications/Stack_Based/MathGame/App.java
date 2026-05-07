package Applications.Stack_Based.MathGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class App {

    Stack<Integer> data = new Stack<>();
    Stack<Integer> history = new Stack<>();

    public void showOperationsAllowed(){
        Map<Object, String> ops = new HashMap<>();

        ops.put("n", "Push any number");
        ops.put("+", "ADD last 2 numbers");
        ops.put("c", "Cancel / remove last number");
        ops.put("d", "Double last number");
        ops.put("t", "That's it, lets stop and see the output");

        for(Map.Entry<Object, String> entry : ops.entrySet()){
            System.out.println(entry.getKey()+" - > "+entry.getValue());
        }
    }

    public void pushNumber(int num){
        if(data.isEmpty() && history.isEmpty()){
            data.push(num);
        }else{
            history.push(data.peek());
            data.push(num);
        }
    }

    public int getTop(Stack<Integer> stack){
        return stack.peek();
    }

    public void deleteNum(){
        data.pop();
        history.pop();
    }

    public int showTotal(){
        int sum = 0;
        while (!data.isEmpty()){
            sum += data.pop();
        }

        return sum;
    }
}
