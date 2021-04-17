package com.chatbot.main;
import java.util.Random;

public class AutoToken {
    public static void botToken(String match, String userName) {
        Random rand = new Random();
        int questionPermission = rand.nextInt(2);

        userName = userName.equals("") ? "You" : userName;

        if (match.contains("fine")) {
            System.out.print("\nAlexa: Sounds Good!\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("name")) {
            System.out.print("\nAlexa: My name is Alexa.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("see")) {
            System.out.print("\nAlexa: Yes! "+ userName + "\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("bot")) {
            System.out.print("\nAlexa: Yes I am a robot,\nbut I’m a good one. Let me prove it.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("human")) {
            System.out.print("\nAlexa: No I am a robot,\nbut I’m a good one. Let me prove it.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("old")) {
            System.out.print("\nAlexa: I'm a robot!\nAge is not Matter :)\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("save")) {
            System.out.print("\nAlexa: No!\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("made")) {
            System.out.print("\nAlexa: Murshalin made me Today :)\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("language")) {
            System.out.print("\nAlexa: I speak English!\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("mother")) {
            System.out.print("\nAlexa: I am Robot :) I haven't Mom.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("where")) {
            System.out.print("\nAlexa: I live in Internet.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("today")) {
            System.out.print("\nAlexa: Today is Awesome day!\nfeeling Good.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("master")) {
            System.out.print("\nAlexa: His name Murshalin.\n");
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("thank")) {
            System.out.print("\nAlexa: You are welcome.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("yes")) {
            System.out.print("\nAlexa: Nice Guy!.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.equals("no")) {
            System.out.print("\nAlexa: why?\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("love")) {
            System.out.print("\nAlexa: hehehehh! I am a Robot mate!\n" +
                    "and robot haven't heart for love.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("marry")) {
            System.out.print("\nAlexa: hehehehh! I am a Robot mate.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("god")) {
            System.out.print("\nAlexa: I belive that there is\nonly one god Allah.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.startsWith("ok")) {
            System.out.print("\nAlexa: thanks for understanding.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("joke")) {
            System.out.print("\nAlexa: ");
            ReserveJoke.botJoke();
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("how")) {
            System.out.print("\nAlexa: I'm doing good.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.contains("alexa")) {
            System.out.print("\nAlexa: Yes, I'm Here.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.equals("do you")) {
            System.out.print("\nAlexa: That’s a good question!\n" +
                    "Right now, I’m your\nvirtual assistant.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.equals("job")) {
            System.out.print("\nAlexa: That’s a good question!\n" +
                    "Right now, I’m your\nvirtual assistant.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else if (match.equals("mursahlin")) {
            System.out.print("\nAlexa: He made me.\n");
            if (questionPermission==1) { ReserveQuestion.botQuestion(); }
            System.out.print("\n"+ userName +": ");
        }
        else {
            System.out.print("\nAlexa: ");
            if (questionPermission==1) {
                ReserveQuestion.botQuestion();
            }
            else {
                System.out.println("Ask me anything.");
            }
            System.out.print("\n\n"+ userName +": ");
        }
    }
}