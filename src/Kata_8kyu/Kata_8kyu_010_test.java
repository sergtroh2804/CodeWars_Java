package Kata_8kyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata_8kyu_010_test {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Kata_8kyu_010.reverse(5));
    }
    @Test
    public void anotherTest() {
        assertArrayEquals(new int[]{8,7,6,5,4,3,2,1},Kata_8kyu_010.reverse(8));
    }
}

