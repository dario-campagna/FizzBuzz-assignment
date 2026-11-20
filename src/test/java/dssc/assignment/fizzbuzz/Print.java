package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Print {

    private static final String FIZZBUZZES_1_TO_15 = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz";
    private static final PrintStream STDOUT = System.out;

    @Test
    void numbers_from_1_to_100() {
        SpyDisplay spyDisplay = new SpyDisplay();
        FizzBuzz fizzBuzz = new FizzBuzz(spyDisplay);

        fizzBuzz.print(IntStream.range(1, 16));

        assertEquals(FIZZBUZZES_1_TO_15, spyDisplay.text);
    }

    private static class SpyDisplay implements Display {

        private String text;

        @Override
        public void show(String text) {
            this.text = text;
        }
    }
}
