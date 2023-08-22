package Kata_8kyu;
/*
Implement a function which convert the given boolean value into its string representation.

Note: Only valid inputs will be given.
 */
public class Kata_8kyu_008 {
    public static String convert(boolean b) {
        String result = "false";
        if (b) result = "true";
        return result;
    }
}
