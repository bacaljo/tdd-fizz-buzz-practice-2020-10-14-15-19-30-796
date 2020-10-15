package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number) {
        if (number == 1)
            return "1";
        else if (isMultipleOfNumber(number, 3)) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        } else if (number == 7) {
            return "Whizz";
        }

        return null;
    }

    private boolean isMultipleOfNumber(int number, int modulus) {
        return number % modulus == 0;
    }
}
