import java.util.Random; // For generating * randoms
import java.util.Scanner; // For taking inputs

public class Main {
    public static int generateSecretNumber(){
        Random rand = new Random(); //instance of random class
        int rand_num = rand.nextInt(20); // Generate random number from 0 - 100
        return rand_num;
    }
    public static void main(String[] args) {
        // Global variables
        Scanner scannerObj = new Scanner(System.in);  // Creating a Scanner object
        int secret_num = generateSecretNumber();
        int tries_count = 1;
        int recent_guess=0;

        // App event loop
        while(true){
            System.out.println("Guess the secret number : ");
            int userGuess = scannerObj.nextInt();

            // Correct guess
            if(userGuess == secret_num){
                System.out.println("==============================================================");
                System.out.println("Bravo! You guessed it right.");
                System.out.println("Number of tries : " + tries_count);
                System.out.println("==============================================================");
                break;

            }
            // Less than guess
            else if(userGuess < secret_num){
                System.out.println("Your guess is too small");
            }
            // High guess
            else{
                System.out.println("Your guess is too high");
            }

            // Increase try count var
            if(userGuess != recent_guess){
                recent_guess = userGuess;
                tries_count += 1;
            }

            // Printing nothing for UI/UX sake
            System.out.println(" ");
        }
    }
}