package Rock_Paper_scissor;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // 0 for Rock
        //1 for Paper
        //2 for Scissor
        for (int i = 0; i < 5; i++) {
                System.out.println("Enter 0 for Rock, 1 for Paper & 2 for Scissor");
                Scanner sc = new Scanner(System.in);
                int userinput = sc.nextInt();

                Random random = new Random();
                int computerinput = random.nextInt(3);


            if (userinput == computerinput) {
                System.out.println("Draw");
            } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
                System.out.println("You Win");
            } else {
                System.out.println("Computer Wins");
            }

            if (computerinput == 0) {
                System.out.println("Computer Choice : " + "Rock");
            } else if (computerinput == 1) {
                System.out.println("Computer Choice : " + "Paper");
            } else if (computerinput == 2) {
                System.out.println("Computer Choice : " + "Scissor");
            }

            if (userinput == 0) {
                System.out.println("You Choose : " + "Rock");
            } else if (userinput == 1) {
                System.out.println("You Choose  : " + "Paper");
            } else if (userinput == 2) {
                System.out.println("You Choose : " + "Scissor");
            }

        }

    }
}
