package algorithms;

import algorithms.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class FizzBuzzTest {
    @Test
    public void test_returns_non_FizzBuzz_number() {
        assertEquals("2", FizzBuzz.checkFizzBuzz(2));
    }
    @Test
    public void test_returns_Fizz_for_multiples_of_3() {
        String testItem1 = FizzBuzz.checkFizzBuzz(3);
        String testItem2 = FizzBuzz.checkFizzBuzz(6);
        String testItem3 = FizzBuzz.checkFizzBuzz(9);

        String [] expected = { "Fizz", "Fizz", "Fizz" };
        String [] actual = { testItem1, testItem2, testItem3 };
        assertArrayEquals(actual, expected);
    }
    @Test
    public void test_returns_Buzz_for_multiples_of_5() {
        String testItem1 = FizzBuzz.checkFizzBuzz(5);
        String testItem2 = FizzBuzz.checkFizzBuzz(10);
        String testItem3 = FizzBuzz.checkFizzBuzz(20);

        String [] expected = { "Buzz", "Buzz", "Buzz" };
        String [] actual = { testItem1, testItem2, testItem3 };
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test_returns_FizzBuzz_for_multiples_of_3_and_5() {
        String testItem1 = FizzBuzz.checkFizzBuzz(15);
        String testItem2 = FizzBuzz.checkFizzBuzz(30);
        String testItem3 = FizzBuzz.checkFizzBuzz(45);

        String [] expected = { "FizzBuzz", "FizzBuzz", "FizzBuzz" };
        String [] actual = { testItem1, testItem2, testItem3 };
        assertArrayEquals(actual, expected);
    }
    @Test
    public void test_handles_0_input() {
        String value = FizzBuzz.checkFizzBuzz(0);

        assertSame(value, "Invalid Input");
    }
}
