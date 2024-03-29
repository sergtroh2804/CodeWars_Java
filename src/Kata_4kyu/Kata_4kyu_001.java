package Kata_4kyu;

/*
Roman Numerals Helper

Write two functions that convert a roman numeral to and from an integer value. Multiple roman numeral values
will be tested for each function.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping
any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Input range : 1 <= n < 4000

In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").
Examples

to roman:
2000 -> "MM"
1666 -> "MDCLXVI"
1000 -> "M"
 400 -> "CD"
  90 -> "XC"
  40 -> "XL"
   1 -> "I"

from roman:
"MM"      -> 2000
"MDCLXVI" -> 1666
"M"       -> 1000
"CD"      -> 400
"XC"      -> 90
"XL"      -> 40
"I"       -> 1

Help
Symbol 	Value
I 	    1
IV 	    4
V 	    5
X 	    10
L 	    50
C 	    100
D 	    500
M 	    1000


https://www.codewars.com/kata/51b66044bce5799a7f000003/train/java
 */

public class Kata_4kyu_001 {
    public static String toRoman(int n) {
        String result = "";
        while (n > 0){
            if (n >= 1000) {
                result += "M";
                n -= 1000;
            } else if (n >= 900) {
                result += "CM";
                n -= 900;
            } else if (n >= 500) {
                result += "D";
                n -= 500;
            } else if (n >= 400) {
                result += "CD";
                n -= 400;
            } else if (n >= 100) {
                result += "C";
                n -= 100;
            } else if (n >= 90) {
                result += "XC";
                n -= 90;
            } else if (n >= 50) {
                result += "L";
                n -= 50;
            } else if (n >= 40) {
                result += "XL";
                n -= 40;
            } else if (n >= 10) {
                result += "X";
                n -= 10;
            } else if (n >= 9) {
                result += "IX";
                n -= 9;
            } else if (n >= 5) {
                result += "V";
                n -= 5;
            } else if (n >= 4) {
                result += "IV";
                n -= 4;
            } else if (n >= 1) {
                result += "I";
                n -= 1;
            }
        }

        return result;
    }

    public static int fromRoman(String romanNumeral) {
        int[] digits = new int[romanNumeral.length()];
        int iterator = 0;
        int result = 0;
        for(char romanNum:romanNumeral.toCharArray()){
            switch (romanNum){
                case 'M':
                    digits[iterator] = 1000;
                    if (iterator > 0){
                        if (digits[iterator - 1] < digits[iterator]) {
                            digits[iterator - 1] *= -1;
                        }
                    }
                    iterator++;
                    break;
                case 'D':
                    digits[iterator] = 500;
                    if (iterator > 0){
                        if (digits[iterator - 1] < digits[iterator]) {
                            digits[iterator - 1] *= -1;
                        }
                    }
                    iterator++;
                    break;
                case 'C':
                    digits[iterator] = 100;
                    if (iterator > 0){
                        if (digits[iterator - 1] < digits[iterator]) {
                            digits[iterator - 1] *= -1;
                        }
                    }
                    iterator++;
                    break;
                case 'L':
                    digits[iterator] = 50;
                    if (iterator > 0){
                        if (digits[iterator - 1] < digits[iterator]) {
                            digits[iterator - 1] *= -1;
                        }
                    }
                    iterator++;
                    break;
                case 'X':
                    digits[iterator] = 10;
                    if (iterator > 0){
                        if (digits[iterator - 1] < digits[iterator]) {
                            digits[iterator - 1] *= -1;
                        }
                    }
                    iterator++;
                    break;
                case 'V':
                    digits[iterator] = 5;
                    if (iterator > 0){
                        if (digits[iterator - 1] < digits[iterator]) {
                            digits[iterator - 1] *= -1;
                        }
                    }
                    iterator++;
                    break;
                case 'I':
                    digits[iterator] = 1;
                    if (iterator > 0){
                        if (digits[iterator - 1] < digits[iterator]) {
                            digits[iterator - 1] *= -1;
                        }
                    }
                    iterator++;
                    break;
            }
        }
        for(int i:digits){
            result += i;
        }
        return result;
    }
}
