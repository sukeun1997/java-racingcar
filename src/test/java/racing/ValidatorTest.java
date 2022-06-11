package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidatorTest {

    /**
     * ValidateInput 테스트
     */
    @Test
    @DisplayName("자동차 이름에 잘 못된 구분자 입력")
    void test_validateInput_01() {
        assertWrongCarNames("a,b.c");
    }

    @Test
    @DisplayName("자동차 이름 알맞은 구분자")
    void test_validateInput_02() {
     Validator.validateInput("a,b,c");
    }

    @Test
    @DisplayName("자동차 이름 하나만 입력")
    void test_validateInput_03() {
        Validator.validateInput("car");
    }

    @Test
    @DisplayName("자동차 이름 끝에 구분자 입력")
    void test_validateInput_04() {
        assertWrongCarNames("car,");
    }

    @Test
    @DisplayName("자동차 이름 공백")
    void test_validateInput_05() {
        assertWrongCarNames("");
    }

    @Test
    @DisplayName("알파벳이 아닌 숫자 및 한글로 자동차 이름 입력")
    void test_validateInput_06() {
        Validator.validateInput("자동차01");
    }

    private void assertWrongCarNames(String inputs) {
        assertThatThrownBy(() -> Validator.validateInput(inputs))
                .isInstanceOf(IllegalArgumentException.class);
    }

    /**
     * ValidateName 테스트
     */
    @Test
    @DisplayName("5글자 이하 입력")
    void test_validateName_01() {
        String carName = "car1";
        Validator.validateName(carName);
    }

    @Test
    @DisplayName("5글자 초과 입력")
    void test_validateName_02() {
        String carName = "car1234";
        assertThatThrownBy(() -> Validator.validateName(carName))
                .isInstanceOf(IllegalArgumentException.class);
    }
}