package com.chatbot.main;

public class AutoToken {
    public static void botToken(String match, int autoQus, String userName) {

        if (match.contains("fine")) {
            System.out.print("\nAlexa: Sounds Good!\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("name")) {
            System.out.print("\nAlexa: My name is Alexa.\n");
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("bot")) {
            System.out.print("\nAlexa: Yes I am a robot,\nbut I’m a good one. Let me prove it.\n");
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("human")) {
            System.out.print("\nAlexa: No I am a robot,\nbut I’m a good one. Let me prove it.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("old")) {
            System.out.print("\nAlexa: I'm a robot! :) 2 Days\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("save")) {
            System.out.print("\nAlexa: No!\n");
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("made")) {
            System.out.print("\nAlexa: Murshalin made me Today :)\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("language")) {
            System.out.print("\nAlexa: I speak English!\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("mother")) {
            System.out.print("\nAlexa: I am Robot :) I haven't Mom.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("where")) {
            System.out.print("\nAlexa: I live in Internet.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("today")) {
            System.out.print("\nAlexa: Today is Awesome day!\nfeeling Good.\n");
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("master")) {
            System.out.print("\nAlexa: His name Murshalin.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("thank")) {
            System.out.print("\nAlexa: You are welcome.\n");
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("yes")) {
            System.out.print("\nAlexa: Nice Guy!.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("no")) {
            System.out.print("\nAlexa: why?.\n");
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("love")) {
            System.out.print("\nAlexa: hehehehh! I am a Robot mate!\n" +
                    "and robot haven't heart for love.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("marry")) {
            System.out.print("\nAlexa: hehehehh! I am a Robot mate.\n");
            ReserveQuestion.botQuestion(autoQus);
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.contains("god")) {
            System.out.print("\nAlexa: I belive that there is\nonly one god Allah.\n");
            System.out.print("\n"+ userName +" : ");
        }
        else if (match.startsWith("ok")) {
            System.out.print("\nAlexa: thanks for understanding.\n");
            System.out.print("\n"+ userName +" : ");
        }
        else {
            System.out.print("\nAlexa: ask me anything!\n\n"+ userName +" : ");
        }
    }
}