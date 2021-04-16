package com.chatbot.main;
import java.util.Scanner;
import java.util.Random;

public class MainProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = input.nextLine();
        userName = userName.equals("") ? "You" : userName;

        System.out.print("\nAlexa: Hey, "+ userName +" Welcome!\n" +
                "I'm Alexa! Your visual assistant.\n\n"+ userName +" : ");

        String firstResponse = input.nextLine();
        if (firstResponse.startsWith("bye")) {
            System.out.println("\nAlexa: Okay Bye " + userName + "!\nHave a nice day!");
            System.exit(0);
        }
        AutoToken.botToken(firstResponse, userName);

        boolean firstReply = firstResponse.equals("") == false;

        do {
            if (firstReply == true) {
                String secondResponse = input.nextLine();
                if (secondResponse.equals("") == true) {
                    System.out.println("\nAlexa: No Response, Bye!");
                    System.exit(0);
                }

                if (secondResponse.startsWith("bye")) {
                    System.out.println("\nAlexa: Okay Bye " + userName + "!\nHave a nice day!");
                    System.exit(0);
                }

                AutoToken.botToken(secondResponse, userName);
            }
            else {
                System.out.println("\nAlexa: No Response, Bye!");
            }
        } while (firstReply == true);
    }
}