package racing;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern INPUT_PATTERN = Pattern.compile("[[가-힣a-zA-Z0-9]+,]*[가-힣a-zA-Z0-9]+");

    public static void validateInput(String inputs) {
        if (!INPUT_PATTERN.matcher(inputs).matches()) {
            throw new IllegalArgumentException("옳바른 자동차 이름을 입력해주세요");
        }
    }

    public static void validateName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.");
        }
    }



}
