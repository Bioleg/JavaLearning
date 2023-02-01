package net.bioleg;

import java.util.Scanner;

public class triviaGame2 {
    public static void main(String[] args) {

        String[] questions = new String[5];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";
        questions[3] = "How High is Mount Everest? (Answer in km)";

        String[] answers = new String[5];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";
        answers[3] = "8848";

        int score = 0;
        int question = 0;

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            for (int i = 0; 0 < questions.length; i++) {
                outputQuestions(questions, question);
                String input = getAnswer(scanner);
                boolean isCorrect = CheckAnswer(answers, question, input);
                if (isCorrect) {
                    question++;
                    score++;
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Would you like to continue(yes/no)");
                    String wouldLikeToContinue = scanner.nextLine();
                    if (wouldLikeToContinue.equals("no")) {
                        System.exit(0);
                    }
                }
            }
        }
    }

    public static void outputQuestions(String[] questions, int whichQuestion) {
        System.out.println(questions[whichQuestion]);
    }
    public static String getAnswer(Scanner scanner) {
        String playerInput = scanner.nextLine();
        return playerInput;
    }

    public static boolean CheckAnswer(String[] answers, int whichQuestion, String playerInput) {
        if(answers[whichQuestion].equals(playerInput)) {
            System.out.println("correct");
            return true;
        } else {
            return false;
        }
    }
}
