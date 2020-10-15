package tdd.fizzbuzz;

public class FizzBuzz {

    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String WHIZZ = "Whizz";

    public String countOff(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        if (isMultipleOfNumber(number, 3)) {
            stringBuilder.append(FIZZ);
        }
        if (isMultipleOfNumber(number, 5)) {
            stringBuilder.append(BUZZ);
        }
        if (isMultipleOfNumber(number, 7)) {
            stringBuilder.append(WHIZZ);
        }

        return stringBuilder.toString().isEmpty()
                ? Integer.toString(number)
                : stringBuilder.toString();
    }

    private boolean isMultipleOfNumber(int number, int modulus) {
        return number % modulus == 0;
    }
}
