package com.chatbot.main;
import java.util.Random;

public class ReserveJoke {
    public static void botJoke() {

        String[] joke = new String[20];

        joke[0] = "My wife told me\nto stop impersonating a\nflamingo. I had to\nput my foot down.";
        joke[1] = "I went to buy\nsome camo pants but\ncouldn’t find any.";
        joke[2] = "I failed math so\nmany times at school,\nI can’t even count.";
        joke[3] = "I used to have\na handle on life,\nbut then it broke.";
        joke[4] = "I was wondering why\nthe frisbee kept getting\nbigger and bigger,\nbut then it hit me.";
        joke[5] = "I heard there were\na bunch of break-ins\nover at the car park.\nThat is wrong on\nso many levels.";
        joke[6] = "I want to die\npeacefully in my sleep,\nlike my grandfather…\nNot screaming and yelling\nlike the passengers in\nhis car.";
        joke[7] = "When life gives you\nmelons, you might\nbe dyslexic.";
        joke[8] = "Don’t you hate it\nwhen someone answers their\nown questions? I do.";
        joke[9] = "It takes a lot\nof balls to golf\nthe way I do.";
        joke[10] = "I told him to\nbe himself; that was\npretty mean, I guess.";
        joke[11] = "I know they say\nthat money talks, but\nall mine says is ‘Goodbye.’";
        joke[12] = "The problem with kleptomaniacs\nis that they always\ntake things literally.";
        joke[13] = "I can’t believe I\ngot fired from the\ncalendar factory. All I\ndid was take a day off.";
        joke[14] = "Most people are shocked\nwhen they find out\nhow bad I am\nas an electrician.";
        joke[15] = "Never trust atoms; they\nmake up everything.";
        joke[16] = "My wife just found\nout I replaced our\nbed with a trampoline.\nShe hit the ceiling!";
        joke[17] = "I was addicted to\nthe hokey pokey, but\nthen I turned myself around.";
        joke[18] = "I used to think\nI was indecisive. But\nnow I’m not so sure.";
        joke[19] = "Russian dolls are so\nfull of themselves.";

        Random rand = new Random();
        System.out.println(joke[rand.nextInt(20)]);
    }
}