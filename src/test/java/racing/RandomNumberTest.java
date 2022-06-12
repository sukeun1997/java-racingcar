package racing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    @Test
    void test_generateNumber_01() {

        for (int i = 0; i < 100; i++) {
            int number = RandomNumber.generateNumber();

            if (!(number >= 0 && number < 10)) {
                fail();
            }
        }
    }
}