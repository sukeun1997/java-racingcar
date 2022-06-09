package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidatorTest {

    @Test
    @DisplayName("자동차 이름에 잘 못된 구분자 입력")
    void test_validateInput_01() {
        boolean result = Validator.validateInput("a,b.c");
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("자동차 이름 알맞은 구분자")
    void test_validateInput_02() {
        boolean result = Validator.validateInput("a,b,c");
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("자동차 이름 하나만 입력")
    void test_validateInput_03() {
        boolean result = Validator.validateInput("car");
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("자동차 이름 끝에 구분자 입력")
    void test_validateInput_04() {
        boolean result = Validator.validateInput("car,");
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("자동차 이름 공백")
    void test_validateInput_05() {
        boolean result = Validator.validateInput("");
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("알파벳이 아닌 숫자 및 한글로 자동차 이름 입력")
    void test_validateInput_06() {
        boolean result = Validator.validateInput("자동차01");
        assertThat(result).isTrue();
    }
}