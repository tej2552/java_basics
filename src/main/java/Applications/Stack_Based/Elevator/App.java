package Applications.Stack_Based.Elevator;

import Exceptions.ElevatorExceptions;

import java.util.Stack;

public class App {

    Stack<Integer> personStack = new Stack<>();
    Stack<Integer> personWithMaxPriority = new Stack<>();
    Stack<Integer> personWithLowPriority = new Stack<>();

    public void addPerson(int priority){
        personStack.push(priority);

        if(personWithMaxPriority.isEmpty() && personWithLowPriority.isEmpty()){
            personWithMaxPriority.push(priority);
            personWithLowPriority.push(priority);
        }else{
            if(priority >= personWithMaxPriority.peek()){
                personWithMaxPriority.push(priority);
            }

            if(priority <= personWithLowPriority.peek()){
                personWithLowPriority.push(priority);
            }
        }
    }

    public int dropLastPersonEntered(){
        int val = personStack.pop();

        if(val == personWithMaxPriority.peek()){
            personWithMaxPriority.pop();
        }

        if(val == personWithLowPriority.peek()){
            personWithLowPriority.pop();
        }

        return val;
    }

    public int showPersonNearToDoor(){
        return personStack.peek();
    }

    public int showPersonWithHighestPriority() throws ElevatorExceptions {
        if(personWithMaxPriority.isEmpty()){
            throw new ElevatorExceptions("No One in elevator");
        }

        return personWithMaxPriority.peek();
    }

    public int showPersonWithLeastPriority() throws ElevatorExceptions{
        if(personWithLowPriority.isEmpty()){
            throw new ElevatorExceptions("No One in elevator");
        }

        return personWithLowPriority.peek();
    }

    public void showAllPersonPriority(){
        Stack<Integer> copy = new Stack<>();
        copy.addAll(personStack);

        System.out.println("___________________________");
        System.out.println("ELEVATOR INFO");
        while (!copy.isEmpty()){
            System.out.println("\t"+copy.pop());
        }
        System.out.println("___________________________");
    }
}
