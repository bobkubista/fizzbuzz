package com.bobkubista.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    private FizzBuzz fizz = new FizzBuzz();

    @Test
    void testOneNumber() {
        assertEquals("1", fizz.buzz(1));
    }

    @Test
    void testFizz() {
        assertEquals("Fizz", fizz.buzz(3));
    }

    @Test
    void testNextFizz() {
        assertEquals("Fizz", fizz.buzz(6));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", fizz.buzz(5));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", fizz.buzz(15));
    }
}
