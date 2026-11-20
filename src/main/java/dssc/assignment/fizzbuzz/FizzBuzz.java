package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {
    
    private final Display display;

    public FizzBuzz(Display display) {
        this.display = display;
    }

    public static void main(String... args) {
        new FizzBuzz((System.out::println)).print(IntStream.range(1, 101));
    }

    public String convert(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }

    public void print(IntStream range) {
        Stream<String> fizzBuzzes = range.mapToObj(this::convert);
        display.show(fizzBuzzes.collect(Collectors.joining(", ")));
    }
}
