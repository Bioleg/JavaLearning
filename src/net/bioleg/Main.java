package net.bioleg;

import java.sql.Array;
import java.util.*;

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

        // LISTS
        List<String> questionList = new ArrayList<>();
        questionList.add("What language is spoken in Germany?");
        questionList.add("What language is spoken in Poland?");
        questionList.add("What language is spoken in Ukraine?");

        questionList.remove(2);

        System.out.println(questionList.size());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(1337);

        // MAPS
        Map<String, String> CountryToCapital = new HashMap<>();
        CountryToCapital.put("Germany", "Berlin");
        CountryToCapital.put("Poland", "Warsaw");
        CountryToCapital.put("Italy", "Rome");
        CountryToCapital.put("UK", "London");

        System.out.println(CountryToCapital.get("Germany"));

        // SETS

        Set<String> usernames = new HashSet<>();
        usernames.add("_Brunos_");
        usernames.add("Domin453");

        System.out.println(usernames.add("Technoblade"));

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