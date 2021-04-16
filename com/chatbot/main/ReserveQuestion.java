package com.chatbot.main;
import java.util.Random;

public class ReserveQuestion {
    public static void botQuestion(){

        String[] question = new String[16];

        question[0] = "Do you like people?";
        question[1] = "Do you know a joke?";
        question[2] = "Do you love me?";
        question[3] = "Will you marry me?";
        question[4] = "Does Santa Claus exist?";
        question[5] = "Are you part of the Matrix?";
        question[6] = "You’re cute.";
        question[7] = "You’re beautiful.";
        question[8] = "You’re handsome.";
        question[9] = "Do you have a hobby?";
        question[10] = "You’re smart.";
        question[11] = "You’re clever.";
        question[12] = "You’re intelligent.";
        question[13] = "Tell me about your personality.";
        question[14] = "How can I help you ?";
        question[15] = "How old are you ?";


        Random rand = new Random();
        System.out.println(question[rand.nextInt(16)]);
    }
}