package Kata_4kyu;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Kata_4kyu_001_test {
    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", Kata_4kyu_001.toRoman(1), is("I"));
        assertThat("2 converts to 'II'", Kata_4kyu_001.toRoman(2), is("II"));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", Kata_4kyu_001.fromRoman("I"), is(1));
        assertThat("'II' converts to 2", Kata_4kyu_001.fromRoman("II"), is(2));
        assertThat("'IV' converts to 4", Kata_4kyu_001.fromRoman("IV"), is(4));
        assertThat("'VIII' converts to 8", Kata_4kyu_001.fromRoman("VIII"), is(8));
        assertThat("'MDCLXVI' converts to 1666", Kata_4kyu_001.fromRoman("MDCLXVI"), is(1666));
        assertThat("'XCII' converts to 92", Kata_4kyu_001.fromRoman("XCII"), is(92));
        assertThat("'MMDXL' converts to 2540", Kata_4kyu_001.fromRoman("MMDXL"), is(2540));
    }

}
