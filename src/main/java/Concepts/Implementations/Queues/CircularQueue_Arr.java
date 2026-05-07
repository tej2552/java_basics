package Concepts.Implementations.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class CircularQueue_Arr {

    int front = 0;
    int rear = -1;
    int size = 5;
    int[] queue = new int[size];
    int count = 0;

    public void addEle(int num){
        if(count != size){
            rear = (rear + 1) % size;
            queue[rear] = num;
            count++;
        }
    }

    public void deleteEle(){
        if(count == 0){
            System.out.println("No elements to delete");
            return;
        }

        front = (front + 1) % size;
        count -= 1;
    }

    public void showQueue(){
        int temp = front;
        for(int i = 0 ; i < count ; i++){
            System.out.println(queue[temp]);
            temp = (temp + 1) % size;
        }
    }


}
