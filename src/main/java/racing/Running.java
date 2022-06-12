package racing;

import racing.model.Car;
import racing.view.InputView;

import java.util.List;

public class Running {

    private final InputView inputView = new InputView();

    public void startGame() {
        String[] carNames = inputView.getCarNames();
        int playCount = inputView.getPlayCount();

        List<Car> cars = CarFactory.createCars(carNames);

        Racing racing = new Racing(cars);
        racing.doRace(playCount);
    }
}
