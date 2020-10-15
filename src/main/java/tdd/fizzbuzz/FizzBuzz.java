package tdd.fizzbuzz;

public class FizzBuzz {

    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";

    public String countOff(int number) {
        if (number == 1)
            return "1";
        else if (isMultipleOfNumber(number, 3)) {
            return FIZZ;
        } else if (isMultipleOfNumber(number, 5)) {
            return BUZZ;
        } else if (number == 7) {
            return "Whizz";
        }

        return null;
    }

    private boolean isMultipleOfNumber(int number, int modulus) {
        return number % modulus == 0;
    }
}
