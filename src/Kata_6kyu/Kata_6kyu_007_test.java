package Kata_6kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_6kyu_007_test {
    @Test
    public void test1() {
        assertEquals(3, Kata_6kyu_007.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, Kata_6kyu_007.bouncingBall(30.0, 0.66, 1.5));
    }
}
