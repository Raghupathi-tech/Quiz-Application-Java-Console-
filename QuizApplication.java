import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Capital of India?",
                "2. Java is a ?",
                "3. 5 + 5 = ?"
        };

        String[][] options = {
                {"A. Chennai", "B. Delhi", "C. Mumbai", "D. Kolkata"},
                {"A. OS", "B. Language", "C. Browser", "D. Database"},
                {"A. 8", "B. 9", "C. 10", "D. 11"}
        };

        char[] answers = {'B', 'B', 'C'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                score++;
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Score: " + score + "/" + questions.length);

        sc.close();
    }
}
