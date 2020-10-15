package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number) {
        if (number == 1)
            return "1";
        else if (number == 3) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        }

        return null;
    }
}
