import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quizgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"A scalar quantity can be described by ?",
                "A vector quantity can be described by magnitude, unit and ?",
                "Which of the following is the vector quantity ?",
                "Which of the following is a scalar quantity ?",
                "Two lines are drawn at right angles to each other are known as ?"};

        String[][] options = {{"A. magnitude", "B. unit", "C. magnitude and unit", "D. number"},
                {"A. direction", "B. rotation", "C. dimension", "D. unit vector"},
                {"A. energy", "B. power", "C. work", "D. momentum"},
                {"A. mass", "B. displacement", "C. force", "D. torque"},
                {"A. coordinate axis", "B. xy-axis", "C. components", "D. cartesian axis"}};

        String[] answers = {"C", "A", "D", "A", "D"};
        String[] guesses=new String[5];

        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                }
            };
            timer.schedule(timerTask, 10000); // Set the timer for 10 seconds

            System.out.println("------------------------");
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            String guess = scanner.nextLine().toUpperCase();
             guesses[i]+=guess;

            timer.cancel();

            if (guess.equals(answers[i])) {
                score++;
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
                System.out.println("The correct answer is " + answers[i]);
            }
        }

        System.out.println("****************");
        System.out.println("*****RESULT******");
        System.out.println("****************");

        for (String answer : answers) {
            System.out.print(answer + " ");
        }
        System.out.println();

        for(int i=0;i<guesses.length;i++){
            System.out.println(guesses[i]+" ");
        }
        System.out.println();

        int percentageScore = score / questions.length * 100;
        System.out.println("Score: " + percentageScore + "%");
    }
}

