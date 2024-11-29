import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        String[] game = {"Stone", "Paper", "Scissor"};
        List<String> gamelist = Arrays.asList(game);  // Create a List from the array
        Collections.shuffle(gamelist);  // Shuffle the list
        System.out.println("Choose between 'Stone', 'Paper', 'Scissor'");
        
        Scanner a = new Scanner(System.in);
        String myguess = a.nextLine();
        
        // Use .equals() for string comparison
        if (myguess.equals(gamelist.get(0))) {
            System.out.println("You tie the game");
            System.out.println(gamelist.get(0));
        } 
        // Fix the logical OR conditions and use .equals() for comparison
        else if ((myguess.equals("Stone") && gamelist.get(0).equals("Scissor")) ||
                 (myguess.equals("Scissor") && gamelist.get(0).equals("Paper")) ||
                 (myguess.equals("Paper") && gamelist.get(0).equals("Stone"))) {
            System.out.println("You won the game buddy");
            System.out.println(gamelist.get(0));
        } else {
            System.out.println("You lose the game");
            System.out.println(gamelist.get(0));  // Show the computer's choice
        }
        
        a.close();
    }
}
