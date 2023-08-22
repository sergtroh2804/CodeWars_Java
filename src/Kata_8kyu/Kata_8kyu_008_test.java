package Kata_8kyu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata_8kyu_008_test {
    @Test void testTrue(){
        assertEquals("true", Kata_8kyu_008.convert(true));
    }

    @Test void testFalse(){
        assertEquals("false", Kata_8kyu_008.convert(false));
    }
}
