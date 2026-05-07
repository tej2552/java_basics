package Applications.Stack_Based.Movie;

import Exceptions.MovieExceptions;

import java.util.Objects;
import java.util.Stack;

public class App {

    Stack<String> moviePhases = new Stack<>();
    Stack<String> previousPhase = new Stack<>();
    String currPhaseBeforeRewinding = " ";

    public void watchMovie(String phase){
        if(moviePhases.isEmpty() && previousPhase.isEmpty()){
            moviePhases.push(phase);
        }else{
            previousPhase.push(moviePhases.peek());
            if(!Objects.equals(currPhaseBeforeRewinding, " ")){
                currPhaseBeforeRewinding = " ";
            }
            moviePhases.push(phase);
        }
    }

    public void showMovieDetails() throws MovieExceptions {

        if(moviePhases.isEmpty()){
            throw new MovieExceptions("You haven't started to watch a movie yet");
        }

        try{
            System.out.println("Current phase - > "+moviePhases.peek());
            System.out.println("Previous phase - > "+previousPhase.peek());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void rewindPhase(){
        currPhaseBeforeRewinding = moviePhases.pop();
        previousPhase.pop();
    }

    public void redo(){
        if(Objects.equals(currPhaseBeforeRewinding, " ")){
            System.out.println("No rewind done, so redo is not possible");
        }else{
            previousPhase.push(moviePhases.peek());
            moviePhases.push(currPhaseBeforeRewinding);
        }
    }


}
