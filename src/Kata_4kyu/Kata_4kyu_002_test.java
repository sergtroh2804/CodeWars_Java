package Kata_4kyu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

import static org.junit.Assert.assertEquals;

public class Kata_4kyu_002_test {
    @Test
    public void example1() {
        assertEquals( new ArrayList<String>(Arrays.asList("a")),
                Kata_4kyu_002.singlePermutations("a").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example2() {
        assertEquals( new ArrayList<String>(Arrays.asList("ab","ba")),
                Kata_4kyu_002.singlePermutations("ab").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example3() {
        assertEquals( new ArrayList<String>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Kata_4kyu_002.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()) );
    }
}
