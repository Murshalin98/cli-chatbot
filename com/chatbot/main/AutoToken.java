package com.chatbot.main;

public class AutoToken {
    public static void botToken(String match, int autoQus) {

        if (match.contains("fine")) {
            System.out.print("\nBot: Sounds Good!\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("name")) {
            System.out.print("\nBot: Hey I'm ChatBot! I haven't Name.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("bot")) {
            System.out.print("\nBot: Yes I am a robot,\nbut I’m a good one. Let me prove it.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("human")) {
            System.out.print("\nBot: No I am a robot,\nbut I’m a good one. Let me prove it.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("old")) {
            System.out.print("\nBot: I am a robot! :)\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("save")) {
            System.out.print("\nBot: No!\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("made")) {
            System.out.print("\nBot: Murshalin made me Today :)\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("language")) {
            System.out.print("\nBot: I speak English!\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("mother")) {
            System.out.print("\nBot: I am Robot :) I haven't Mom.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("where")) {
            System.out.print("\nBot: I live in Internet.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("today")) {
            System.out.print("\nBot: Today is Awesome day!\nfeeling Good.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("master")) {
            System.out.print("\nBot: His name Murshalin.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("thank")) {
            System.out.print("\nBot: You are welcome.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("yes")) {
            System.out.print("\nBot: Nice Guy!.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("no")) {
            System.out.print("\nBot: why?.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("love")) {
            System.out.print("\nBot: hehehehh! I am a Robot mate!.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else if (match.contains("marry")) {
            System.out.print("\nBot: hehehehh! I am a Robot mate.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\nYou: ");
        }
        else {
            System.out.print("\nBot: ask me anything!\n\nYou: ");
        }
    }
}