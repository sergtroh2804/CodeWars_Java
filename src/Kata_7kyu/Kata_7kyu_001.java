package Kata_7kyu;
/*
Is this a triangle?

Implement a function that accepts 3 integer values a, b, c.
The function should return true if a triangle can be built with the sides of given length and false in any other case.

(In this case, all triangles must have surface greater than 0 to be accepted).

 */
public class Kata_7kyu_001 {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = true;
        if (a <= 0 || b <= 0 || c <= 0) result = false;
        if (a >= b + c) result = false;
        if (b >= a + c) result = false;
        if (c >= b + a) result = false;
        return result;
    }
}
