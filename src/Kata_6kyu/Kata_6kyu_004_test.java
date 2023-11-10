package Kata_6kyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Kata_6kyu_004_test {
    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Kata_6kyu_004.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Kata_6kyu_004.print(5));
    }

    @Test
    public void testDiamond7() {
        StringBuffer expected = new StringBuffer();
        expected.append("   *\n");
        expected.append("  ***\n");
        expected.append(" *****\n");
        expected.append("*******\n");
        expected.append(" *****\n");
        expected.append("  ***\n");
        expected.append("   *\n");

        assertEquals(expected.toString(), Kata_6kyu_004.print(7));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        assertEquals(expected.toString(), Kata_6kyu_004.print(1));
    }

    @Test
    public void testDiamond0() {
        assertEquals(null, Kata_6kyu_004.print(0));
    }

    @Test
    public void testDiamondMinus2() {
        assertEquals(null, Kata_6kyu_004.print(-2));
    }

    @Test
    public void testDiamondMinus1() {
        assertEquals(null, Kata_6kyu_004.print(-1));
    }

    @Test
    public void testDiamond2() {
        assertEquals(null, Kata_6kyu_004.print(2));
    }
}
