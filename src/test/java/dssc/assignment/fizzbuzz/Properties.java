package dssc.assignment.fizzbuzz;

import net.jqwik.api.*;

public class Properties {

    private final FizzBuzz fizzBuzz = new FizzBuzz(null);

    @Property
    boolean multiples_of_three_not_five_are_Fizz(@ForAll("multipleOfThreeNotFive") int number) {
        return fizzBuzz.convert(number).equals("Fizz");
    }

    @Provide
    Arbitrary<Integer> multipleOfThreeNotFive() {
        return Arbitraries.integers().between(1, 33).map(n -> n * 3).filter(n -> n % 5 != 0);
    }

}
