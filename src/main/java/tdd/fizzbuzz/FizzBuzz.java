package tdd.fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzz {

    private final Map<Integer, String> modulusMagicWordMap;

    public FizzBuzz() {
        modulusMagicWordMap = new LinkedHashMap<>();
        modulusMagicWordMap.put(3, "Fizz");
        modulusMagicWordMap.put(5, "Buzz");
        modulusMagicWordMap.put(7, "Whizz");
    }

    public String countOff(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        modulusMagicWordMap.forEach((modulus, magicWord) -> {
            if (isMultipleOfNumber(number, modulus)) {
                stringBuilder.append(magicWord);
            }
        });

        return stringBuilder.toString().isEmpty()
                ? Integer.toString(number)
                : stringBuilder.toString();
    }

    private boolean isMultipleOfNumber(int number, int modulus) {
        return number % modulus == 0;
    }
}
