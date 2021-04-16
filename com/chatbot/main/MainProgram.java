package com.chatbot.main;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = input.nextLine();

        System.out.print("\nBot: Hey, "+ userName +" Welcome! \n\nYou: ");

        String firstResponse = input.nextLine();
        if (firstResponse.equals("bye")) {
            System.out.println("\nBot: Okay Bye!");
            System.exit(0);
        }
        AutoToken.botToken(firstResponse, userName.length());

        boolean firstReply = firstResponse.equals("") == false;

        int i = 0;
        do {
            if (firstReply == true) {
                String secondResponse = input.nextLine();
                if (secondResponse.equals("") == true) {
                    System.out.println("\nBot: No Response, Bye!");
                    System.exit(0);
                }

                if (secondResponse.equals("bye")) {
                    System.out.println("\nBot: Okay Bye!");
                    System.exit(0);
                }

                i = (i > 14) ? 0 : i;
                AutoToken.botToken(secondResponse, i);
            }
            else {
                System.out.println("\nBot: No Response, Bye!");
            }
            i++;
        } while (firstReply == true);
    }
}