package tdd.fizzbuzz;

public class FizzBuzz {

    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String WHIZZ = "Whizz";
    private final String FIZZBUZZ = "FizzBuzz";
    private final String FIZZWHIZZ = "FizzWhizz";
    private final String BUZZWHIZZ = "BuzzWhizz";
    private final String FIZZBUZZWHIZZ = "FizzBuzzWhizz";

    public String countOff(int number) {
        boolean isAMultipleOf3 = isMultipleOfNumber(number, 3);
        boolean isAMultipleOf5 = isMultipleOfNumber(number, 5);
        boolean isAMultipleOf7 = isMultipleOfNumber(number, 7);

        if (isAMultipleOf3 && isAMultipleOf5 && isAMultipleOf7) {
            return FIZZBUZZWHIZZ;
        } else if (isAMultipleOf3 && isAMultipleOf5 && !isAMultipleOf7) {
            return FIZZBUZZ;
        } else if (isAMultipleOf3 && !isAMultipleOf5 && isAMultipleOf7) {
            return FIZZWHIZZ;
        } else if (!isAMultipleOf3 && isAMultipleOf5 && isAMultipleOf7) {
            return BUZZWHIZZ;
        } else if (isAMultipleOf3) {
            return FIZZ;
        } else if (isAMultipleOf5) {
            return BUZZ;
        } else if (isAMultipleOf7) {
            return WHIZZ;
        } else {
            return Integer.toString(number);
        }
    }

    private boolean isMultipleOfNumber(int number, int modulus) {
        return number % modulus == 0;
    }
}
