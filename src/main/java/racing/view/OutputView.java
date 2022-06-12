package racing.view;

import racing.model.Car;

public class OutputView {
    public void showResult(Car car) {
        System.out.println(car.getInfo());
    }
}
