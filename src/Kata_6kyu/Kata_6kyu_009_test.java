package Kata_6kyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata_6kyu_009_test {
    @Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, Kata_6kyu_009.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, Kata_6kyu_009.parse("iiisdosodddddiso"));
    }
}
