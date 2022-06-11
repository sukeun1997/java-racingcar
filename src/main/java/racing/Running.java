package racing;

import racing.view.InputView;

public class Running {

    private final InputView inputView = new InputView();

    public void startGame() {
        String[] carNames = inputView.getCarNames();
        int playCount = inputView.getPlayCount();

        CarFactory.createCars(carNames);

    }
}
