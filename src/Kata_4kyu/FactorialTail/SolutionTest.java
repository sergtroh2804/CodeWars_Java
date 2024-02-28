package Kata_4kyu.FactorialTail;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest{
    @Test
    void  basicTests() {
        assertEquals (2, FactorialTail.zeroes (10, 10));
        assertEquals (3, FactorialTail.zeroes (16, 16));
    }
}
