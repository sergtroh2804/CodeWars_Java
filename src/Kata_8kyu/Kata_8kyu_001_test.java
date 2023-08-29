package Kata_8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_8kyu_001_test {
    @Test
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Kata_8kyu_001.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Kata_8kyu_001.greet("Greg", "Daniel"));
    }
}
