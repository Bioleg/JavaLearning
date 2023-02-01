package net.bioleg;

public class Main {

    public static void main(String[] args) {

        String[] questions = new String[3];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom";
        questions[2] = "What is the chemical symbol for Iron";

//        System.out.println(questions[0]);

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        outputQuestionsAndAnswersXTimes(3, questions, answers);

        System.out.println(sum(385378532,214814));
    }

    public static void outputQuestionsAndAnswersXTimes(int amountOfOutputs , String[] questions, String[] answers) {
        for(int y = 0; y < amountOfOutputs; y++) {
            outputQuestionsAndAnswers(questions, answers);
        }
    }

    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }

}