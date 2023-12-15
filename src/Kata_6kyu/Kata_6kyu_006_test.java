package Kata_6kyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata_6kyu_006_test {
    @Test
    public void testNormalCondition() {
        assertEquals(9, Kata_6kyu_006.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, Kata_6kyu_006.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, Kata_6kyu_006.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }
}
