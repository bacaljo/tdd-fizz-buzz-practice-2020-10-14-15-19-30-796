package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    public FizzBuzz fizzBuzz;
    public final String FIZZ = "Fizz";
    public final String BUZZ = "Buzz";

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

    @Test
    void should_return_Fizz_when_count_off_given_multiples_of_3_but_not_a_multiple_of_5_or_7() {
        // given
        int firstOrderNumber = 3;
        int secondOrderNumber = 6;

        // when
        String firstResult = fizzBuzz.countOff(firstOrderNumber);
        String secondResult = fizzBuzz.countOff(secondOrderNumber);

        // then
        assert(FIZZ).equals(firstResult);
        assert(FIZZ).equals(secondResult);
    }

    @Test
    void should_return_Buzz_when_count_off_given_multiples_of_5_but_not_a_multiple_of_3_or_7() {
        // given
        int firstOrderNumber = 5;
        int secondOrderNumber = 10;

        // when
        String firstResult = fizzBuzz.countOff(firstOrderNumber);
        String secondResult = fizzBuzz.countOff(secondOrderNumber);

        // then
        assert(BUZZ).equals(firstResult);
        assert(BUZZ).equals(secondResult);
    }

    @Test
    void should_return_Whizz_when_count_off_given_7() {
        // given
        int orderNumber = 7;

        // when
        String actual = fizzBuzz.countOff(orderNumber);

        // then
        assert("Whizz").equals(actual);
    }
}
