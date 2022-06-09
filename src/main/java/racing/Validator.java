package racing;

import java.util.regex.Pattern;

public final class Validator {

    private static final Pattern pattern = Pattern.compile("[[가-힣a-zA-Z0-9]+,]*[가-힣a-zA-Z0-9]+");

    private Validator() {}

    public static boolean validateInput(String inputs) {
        return pattern.matcher(inputs).matches();
    }

}
