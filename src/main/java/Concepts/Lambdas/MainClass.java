package Concepts.Lambdas;

public class MainClass {
    //THis method expects an object of type Printable (interface), so we pass in the
    //object of the class which implements the functional interface
    static void printThing(Printable thing){
        thing.print();
    }

    public static void main(String[] args) {
        JustClass jClass = new JustClass();
        printThing(jClass);
    }

    //But instead of doing all these just to access the method of a functional interface,
    //we can directly write the implementation of it directly
    //Go to Lambdas class in this project
}
