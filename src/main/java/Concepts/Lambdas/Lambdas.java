package Concepts.Lambdas;

public class Lambdas {

    public void printThing(Printable thing){
        thing.print();
    }

    public static void main(String[] args) {
        Lambdas lambdas = new Lambdas();
        lambdas.printThing(() -> System.out.println("YAY I printed using lambdas"));
        lambdas.printThing(() -> System.out.println("This is another implementation of my lambda"));
    }
}
