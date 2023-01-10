package org.example.entities;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {


    @Test
    public void add_two_positive_numbers() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(3, 7);
        assertEquals(10, actual);
    }
}
