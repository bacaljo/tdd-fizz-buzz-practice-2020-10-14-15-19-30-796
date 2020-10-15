package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    public FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_1_when_count_off_given_1() {
        // given
        int orderNumber = 1;

        // when
        String actual = fizzBuzz.countOff(orderNumber);

        // then
        assert("1").equals(actual);
    }
}
