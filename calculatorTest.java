package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.multiply(4, 5));
        assertEquals(0, calc.multiply(10, 0));
        assertEquals(-6, calc.multiply(2, -3));
    }
}
