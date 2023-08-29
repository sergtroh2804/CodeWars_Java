package Kata_8kyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata_8kyu_004_test {
    @Test
    public void fixedTests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Kata_8kyu_004.countBy(1,10));
        assertArrayEquals(new int[] {2,4,6,8,10}, Kata_8kyu_004.countBy(2,5));
        assertArrayEquals(new int[] {3,6,9,12,15,18,21}, Kata_8kyu_004.countBy(3,7));
        assertArrayEquals(new int[] {50,100,150,200,250}, Kata_8kyu_004.countBy(50,5));
        assertArrayEquals(new int[] {100,200,300,400,500,600}, Kata_8kyu_004.countBy(100,6));
    }

}
