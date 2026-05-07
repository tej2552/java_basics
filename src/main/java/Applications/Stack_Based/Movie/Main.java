package Applications.Stack_Based.Movie;

import Exceptions.MovieExceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("_________________________________________");
            System.out.println("Movie Scene Player");
            System.out.println("1. Watch a scene");
            System.out.println("2. Rewind");
            System.out.println("3. Redo");
            System.out.println("4. Current details");
            System.out.println("5. Exit");
            System.out.println("_________________________________________");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter scene name:");
                    String scene = sc.nextLine();
                    app.watchMovie(scene);
                    break;

                case 2:
                    app.rewindPhase();
                    break;

                case 3:
                    app.redo();
                    break;

                case 4:
                    try {
                        app.showMovieDetails();
                    } catch (MovieExceptions e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Choose a valid option");
            }
        }
    }
}
