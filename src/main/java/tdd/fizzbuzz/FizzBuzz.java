package tdd.fizzbuzz;

public class FizzBuzz {

    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String WHIZZ = "Whizz";

    public String countOff(int number) {
        if (number == 1)
            return "1";
        else if (isMultipleOfNumber(number, 3)) {
            return FIZZ;
        } else if (isMultipleOfNumber(number, 5)) {
            return BUZZ;
        } else if (isMultipleOfNumber(number, 7)) {
            return WHIZZ;
        }

        return null;
    }

    private boolean isMultipleOfNumber(int number, int modulus) {
        return number % modulus == 0;
    }
}
