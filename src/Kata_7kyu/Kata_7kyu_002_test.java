package Kata_7kyu;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Kata_7kyu_002_test {
    Kata_7kyu_002 metro = new Kata_7kyu_002();

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, metro.countPassengers(list));
    }
}
