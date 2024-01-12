package Kata_7kyu;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_7kyu_005_test {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, Kata_7kyu_005.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata_7kyu_005.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, Kata_7kyu_005.findShort("Let's travel abroad shall we"));
        assertEquals(2, Kata_7kyu_005.findShort("You have passed all of the tests!"));
        assertEquals(1, Kata_7kyu_005.findShort("Simple, given a string of words, return the length of the shortest word(s)."));
        assertEquals(2, Kata_7kyu_005.findShort("String will never be empty and you do not need to account for different data types."));
    }
}
