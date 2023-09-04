package Kata_6kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_6kyu_001_test {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", Kata_6kyu_001.expandedForm(12));
        assertEquals("40 + 2", Kata_6kyu_001.expandedForm(42));
        assertEquals("70000 + 300 + 4", Kata_6kyu_001.expandedForm(70304));
        assertEquals("300000 + 7000 + 400 + 1", Kata_6kyu_001.expandedForm(307401));
        assertEquals("900000", Kata_6kyu_001.expandedForm(900000));
    }
}
