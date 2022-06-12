package racing;

import java.util.Random;

public class RandomNumber {

    private static final Random random = new Random();


    public static int generateNumber() {
        return random.nextInt(10);
    }
}
