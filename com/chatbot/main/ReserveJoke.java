package com.chatbot.main;
import java.util.Random;

public class ReserveJoke {
    public static void botJoke() {

        String[] joke = new String[5];

        joke[0] = "My wife told me\nto stop impersonating a\nflamingo. I had to\nput my foot down.";
        joke[1] = "I went to buy\nsome camo pants but\ncouldn’t find any.";
        joke[2] = "I failed math so many times at school, I can’t even count.";
        joke[3] = "I used to have a handle on life, but then it broke.";
        joke[4] = "I was wondering why the frisbee kept getting bigger and bigger, but then it hit me.";

        Random rand = new Random();
        System.out.println(joke[rand.nextInt(5)]);
    }
}