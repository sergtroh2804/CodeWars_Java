package Kata_7kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_7kyu_004_test {
    @Test
    public void FixedTests() {
        assertEquals(true, Kata_7kyu_004.isIsogram("Dermatoglyphics"));
        assertEquals(true, Kata_7kyu_004.isIsogram("isogram"));
        assertEquals(false, Kata_7kyu_004.isIsogram("moose"));
        assertEquals(false, Kata_7kyu_004.isIsogram("isIsogram"));
        assertEquals(false, Kata_7kyu_004.isIsogram("aba"));
        assertEquals(false, Kata_7kyu_004.isIsogram("moOse"));
        assertEquals(true, Kata_7kyu_004.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Kata_7kyu_004.isIsogram(""));
    }
}
