package Kata_6kyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata_6kyu_008_test {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, Kata_6kyu_008.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, Kata_6kyu_008.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, Kata_6kyu_008.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, Kata_6kyu_008.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, Kata_6kyu_008.arrayDiff(new int [] {}, new int[] {1,2}));
    }
}
