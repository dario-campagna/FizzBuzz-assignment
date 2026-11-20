package dssc.assignment.fizzbuzz;

import net.jqwik.api.*;

public class Properties {

    private final FizzBuzz fizzBuzz = new FizzBuzz(null);

    @Property
    boolean multiples_of_three_start_with_Fizz(@ForAll("multipleOfThree") int number) {
        return fizzBuzz.convert(number).startsWith("Fizz");
    }

    @Provide
    Arbitrary<Integer> multipleOfThree() {
        return Arbitraries.integers().between(1, 100).filter(n -> n % 3 == 0);
    }

}
