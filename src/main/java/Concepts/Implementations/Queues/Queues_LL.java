package Concepts.Implementations.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues_LL {

    Queue<Integer> demoQueue = new LinkedList<>();

    public void addEle(int num){
        demoQueue.offer(num);
    }

    public void showFrontEle(){
        System.out.println(demoQueue.peek());
    }

    public int deleteEle(){
       if(demoQueue.isEmpty()){
           System.out.println("Queue is empty");
           return -1;
       }

       return demoQueue.poll();

    }
}
