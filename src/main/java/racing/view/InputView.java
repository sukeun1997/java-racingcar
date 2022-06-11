package racing.view;

import racing.Validator;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String INPUT_COUNT_MESSAGE = "시도할 횟수는 몇회인가요 ?";
    private final Scanner sc = new Scanner(System.in);

    public String[] getCarNames() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);
        String carNames = sc.nextLine();
        Validator.validateInput(carNames);

        return carNames.split(",");
    }

    public int getPlayCount() {
        System.out.println(INPUT_COUNT_MESSAGE);

        int count = getCount();
        Validator.validateNumber(count);
        return count;
    }

    private int getCount() {
        int count = 0;
        try {
            count = Integer.valueOf(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력 해주세요.");
            getPlayCount();
        }

        return count;
    }
}
