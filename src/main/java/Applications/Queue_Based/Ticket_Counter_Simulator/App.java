package Applications.Queue_Based.Ticket_Counter_Simulator;

import java.util.ArrayDeque;
import java.util.Queue;

public class App {

    Queue<Integer> ids = new ArrayDeque<>();
    int count = 0;

    public void addPersonToTheQueue(int id){
        ids.offer(id);
        count++;
    }

    public int giveTicket(){
        if(ids.isEmpty()){
            return -1;
        }
        count--;
        return ids.poll();
    }

    public int showFrontCustomer() {
        if(ids.isEmpty()){
            return -1;
        }
        return ids.peek();
    }

    public int showCustomerQueueCount(){
        return count;
    }
}
