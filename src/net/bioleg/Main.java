package net.bioleg;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;
        String question1 = "1 + 1 = ";
        String question2 = "8 + 1 = ";
        Boolean answered1 = false;
        Boolean answered2 = false;
        Scanner scanner = new Scanner(System.in);

        while(answered1 = true) {
            System.out.println(question1);
            System.out.println("Type in your answer...");
            String input = scanner.nextLine();
            if (Objects.equals(input, "2")) {
                System.out.println("Correct. You just earned one point");
                score++;
                answered1 = true;

                while(answered2 = true) {
                    System.out.println(question2);
                    System.out.println("Type in your answer...");
                    String input2 = scanner.nextLine();
                    if (Objects.equals(input2, "9")) {
                        System.out.println("Correct. You just earned one point");
                        score++;
                        answered2 = true;

                        System.out.println("You have...");
                        System.out.println(score + " points!");
                        if(score == 2) {
                            System.out.println("You won!");
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
}
