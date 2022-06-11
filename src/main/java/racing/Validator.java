package racing;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern INPUT_PATTERN = Pattern.compile("[[가-힣a-zA-Z0-9]+,]*[가-힣a-zA-Z0-9]+");

    public static boolean validateInput(String inputs) {
        return INPUT_PATTERN.matcher(inputs).matches();
    }

    public static boolean validateName(String carName) {
        return carName.length() <= 5;
    }



}
