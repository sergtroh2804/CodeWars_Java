package Kata_8kyu;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata_8kyu_006_test {
    @Test
    public void testEvenOrOdd() {
        Kata_8kyu_006 eoo = new Kata_8kyu_006();
        assertEquals("Even", eoo.even_or_odd(6));
        assertEquals("Odd", eoo.even_or_odd(7));
        assertEquals("Even", eoo.even_or_odd(0));
        assertEquals("Odd", eoo.even_or_odd(-1));
    }
}
