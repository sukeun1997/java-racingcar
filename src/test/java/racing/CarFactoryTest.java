package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.model.Car;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    /**
     * 자동차 생성 테스트
     */
    @Test
    @DisplayName("주어진 입력값에 따라 이름과 위치 0 을 가지는 자동차 생성")
    void test_createCars_01() {
        String[] carNames = new String[]{"a", "b", "c"};
        List<Car> cars = CarFactory.createCars(carNames);

        assertThat(cars.size()).isEqualTo(3);

        for (int i = 0; i < carNames.length; i++) {
            Car car = cars.get(i);
            assertThat(car.getLocation()).isEqualTo(0);
            assertThat(car.getName()).isEqualTo(carNames[i]);
        }

    }
}