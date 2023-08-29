package Kata_7kyu;

import static org.junit.Assert.*;
import org.junit.Test;
public class Kata_7kyu_001_test {
    @Test
    public void publicTests() {
        assertEquals(true, Kata_7kyu_001.isTriangle(1,2,2));
        assertEquals(false, Kata_7kyu_001.isTriangle(7,2,2));
        assertEquals(false, Kata_7kyu_001.isTriangle(1,2,3));
    }
}
