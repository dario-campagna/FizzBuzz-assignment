package dssc.assignment.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class Convert {

    private final FizzBuzz fizzBuzz = new FizzBuzz(null);

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "41, 41"})
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        assertThat(fizzBuzz.convert(number)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 24})
    void multiples_of_3_to_Fizz(int number) {
        assertThat(fizzBuzz.convert(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 100})
    void multiples_of_5_to_Buzz(int number) {
        assertThat(fizzBuzz.convert(number)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 75})
    void multiples_of_3_and_5_to_FizzBuzz(int number) {
        assertThat(fizzBuzz.convert(number)).isEqualTo("FizzBuzz");
    }
}
