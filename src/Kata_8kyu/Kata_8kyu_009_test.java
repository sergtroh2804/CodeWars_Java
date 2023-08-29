package Kata_8kyu;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata_8kyu_009_test {
    @Test
    public void test1() {
        assertEquals('A', Kata_8kyu_009.getGrade(95,90,93));
        assertEquals('A', Kata_8kyu_009.getGrade(100,85,96));
        assertEquals('A', Kata_8kyu_009.getGrade(92,93,94));
        assertEquals('A', Kata_8kyu_009.getGrade(100,100,100));
    }
    @Test
    public void test2() {
        assertEquals('B', Kata_8kyu_009.getGrade(70,70,100));
        assertEquals('B', Kata_8kyu_009.getGrade(82,85,87));
        assertEquals('B', Kata_8kyu_009.getGrade(84,79,85));
    }
    @Test
    public void test3() {
        assertEquals('C', Kata_8kyu_009.getGrade(70,70,70));
        assertEquals('C', Kata_8kyu_009.getGrade(75,70,79));
        assertEquals('C', Kata_8kyu_009.getGrade(60,82,76));
    }
    @Test
    public void test4() {
        assertEquals('D', Kata_8kyu_009.getGrade(65,70,59));
        assertEquals('D', Kata_8kyu_009.getGrade(66,62,68));
        assertEquals('D', Kata_8kyu_009.getGrade(58,62,70));
    }
    @Test
    public void test5() {
        assertEquals('F', Kata_8kyu_009.getGrade(44,55,52));
        assertEquals('F', Kata_8kyu_009.getGrade(48,55,52));
        assertEquals('F', Kata_8kyu_009.getGrade(58,59,60));
        assertEquals('F', Kata_8kyu_009.getGrade(0,0,0));
    }
}
