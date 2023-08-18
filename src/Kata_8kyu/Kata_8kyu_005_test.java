package Kata_8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_8kyu_005_test {
    @Test
    public static void testOddAndEven() {
        assertEquals(true, Kata_8kyu_005.isLove(1, 4));
    }
    @Test
    public void testEvenAndEven() {
        assertEquals(false, Kata_8kyu_005.isLove(2, 2));
    }
    @Test
    public void testOddAndOdd() {
        assertEquals(false, Kata_8kyu_005.isLove(1, 1));
    }
    @Test
    public void testEvenAndOdd() {
        assertEquals(true, Kata_8kyu_005.isLove(0, 1));
    }
}

