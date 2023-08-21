package Kata_8kyu;
/*
Create a function that takes an integer as an argument
and returns "Even" for even numbers or "Odd" for odd numbers.
 */
public class Kata_8kyu_006 {
    public static String even_or_odd(int number) {
        //Place code here
        String result = "Even";
        if (number % 2 != 0) result = "Odd";
        return result;
    }
}
