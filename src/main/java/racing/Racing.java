package racing;

import racing.model.Car;
import racing.view.OutputView;

import java.util.List;

public class Racing {

    private final List<Car> cars;
    private final OutputView outputView = new OutputView();
    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public void doRace(int playCount) {
        System.out.println("실행 결과");

        for (int i = 0; i < playCount; i++) {
            moveCars();
        }
    }

    private void moveCars() {
        for (Car car : cars) {
            car.move();
            outputView.showResult(car);
        }
        System.out.println();
    }
}
