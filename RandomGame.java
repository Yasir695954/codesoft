
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    
    public static void displayWelcome() {
       
        for (int i = 1; i <= 7; i++) {

            
            if (i==1) {System.out.print("\n\n\t\t\t\t\t\t\t\tW  ");}
            if (i==2) {System.out.print("E  ");}
            if (i==3) {System.out.print("L  ");}
            if (i==4) {System.out.print("C  ");}
            if (i==5) {System.out.print("O  ");}
            if (i==6) {System.out.print("M  ");}
            if (i==7) {System.out.print("E  \n");}
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
    public static void main(String[] args) {
        
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guesses = 0;
        displayWelcome();
        System.out.println("\n\t\t\t\t\t\t\t\tYOU HAVE 10 GUESSES TO GUESS THE CORRECT NUMBER\n");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\t\t\t\t\t\t\t\tGuess the number between (1 - 100):");
            System.out.print("\n\t\t\t\t\t\t\t\t");
            int guess = scanner.nextInt();
            guesses++;
           if (guesses==10){
            if (guess!=number){
            System.out.println("\n\t\t\t\t\t\t\t\tyou didn't guess the correct number ");
            System.out.println("\n\t\t\t\t\t\t\t\tcorrect number was "+number);
           }return;
        }
            if (guess > number) {
                System.out.println("\n\t\t\t\t\t\t\t\t"+guess + " is too high.");
            } else if (guess < number) {
                System.out.println("\n\t\t\t\t\t\t\t\t"+guess + " is too low.");
            } else {
                System.out.println("\n\t\t\t\t\t\t\t\t"+guess + " is correct!");
                break;
            }
        }

        System.out.println("\n\t\t\t\t\t\t\t\tYou got the correct guess in " + guesses + " guesses.");
    }
}
