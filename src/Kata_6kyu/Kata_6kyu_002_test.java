package Kata_6kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_6kyu_002_test {
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, Kata_6kyu_002.comp(a, b));
    }
    @Test
    public void test2() {
        int[] a = new int[]{1, 4, 3, 7, -2, 11};
        int[] b = new int[]{121, 9, 49, 1, 4, 16};
        assertEquals(true, Kata_6kyu_002.comp(a, b));
    }
    @Test
    public void test3() {
        int[] a = new int[]{1, 4, 6, 7, -2, 11};
        int[] b = new int[]{121, 9, 49, 1, 4, 16};
        assertEquals(false, Kata_6kyu_002.comp(a, b));
    }
    @Test
    public void test4() {
        int[] a = new int[]{1, 4, 3, 7, -2, 16};
        int[] b = new int[]{121, 9, 49, 1, 4, 16};
        assertEquals(false, Kata_6kyu_002.comp(a, b));
    }
}
