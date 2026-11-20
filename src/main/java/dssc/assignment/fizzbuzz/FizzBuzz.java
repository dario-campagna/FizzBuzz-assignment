package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String... args) {
        
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

    public void print() {
        Stream<String> fizzBuzzes = IntStream.range(1, 101).mapToObj(this::convert);
        System.out.println(fizzBuzzes.collect(Collectors.joining(", ")));
    }
}
