package Kata_7kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_7kyu_003_test {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(Kata_7kyu_003.nbYear(1500, 5, 100, 5000),15);
        testing(Kata_7kyu_003.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Kata_7kyu_003.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
