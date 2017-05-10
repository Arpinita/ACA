package common;

import java.util.Random;

/**
 * Created by Arpine on 5/9/2017.
 */
public class Inputs {

    public String randomAtoZ() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;
    }

    public String randomNumber() {
        Random random = new Random();
        String randomNumber = "" + random.nextInt(99999);
        return randomNumber;
    }
}
