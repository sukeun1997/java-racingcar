package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.model.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car = new Car("testCar");

    @Test
    @DisplayName("random 값이 4 이상 이라 자동차 이동")
    void test_move_01() {
        car.move(4);
        assertThat(car.getLocation()).isEqualTo(1);
    }

    @Test
    @DisplayName("random 값이 4 미만 이라 자동차 이동불가")
    void test_move_02() {
        car.move(3);
        assertThat(car.getLocation()).isEqualTo(0);
    }
}
