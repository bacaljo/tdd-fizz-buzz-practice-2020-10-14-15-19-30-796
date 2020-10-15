package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    public FizzBuzz fizzBuzz;
    public final String FIZZ = "Fizz";
    public final String BUZZ = "Buzz";
    public final String WHIZZ = "Whizz";
    public final String FIZZBUZZ = "FizzBuzz";
    public final String FIZZWHIZZ = "FizzWhizz";

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
        assert ("1").equals(actual);
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
        assert (FIZZ).equals(firstResult);
        assert (FIZZ).equals(secondResult);
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
        assert (BUZZ).equals(firstResult);
        assert (BUZZ).equals(secondResult);
    }

    @Test
    void should_return_Whizz_when_count_off_given_multiples_of_7_but_not_a_multiple_of_3_or_5() {
        // given
        int firstOrderNumber = 7;
        int secondOrderNumber = 14;

        // when
        String firstResult = fizzBuzz.countOff(firstOrderNumber);
        String secondResult = fizzBuzz.countOff(secondOrderNumber);

        // then
        assert (WHIZZ).equals(firstResult);
        assert (WHIZZ).equals(secondResult);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_multiples_of_3_and_5_but_not_a_multiple_of_7() {
        // given
        int firstOrderNumber = 15;
        int secondOrderNumber = 30;

        // when
        String firstResult = fizzBuzz.countOff(firstOrderNumber);
        String secondResult = fizzBuzz.countOff(secondOrderNumber);

        // then
        assert (FIZZBUZZ).equals(firstResult);
        assert (FIZZBUZZ).equals(secondResult);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_multiples_of_3_and_7_but_not_a_multiple_of_5() {
        // given
        int firstOrderNumber = 21;
        int secondOrderNumber = 42;

        // when
        String firstResult = fizzBuzz.countOff(firstOrderNumber);
        String secondResult = fizzBuzz.countOff(secondOrderNumber);

        // then
        assert (FIZZWHIZZ).equals(firstResult);
        assert (FIZZWHIZZ).equals(secondResult);
    }
}
