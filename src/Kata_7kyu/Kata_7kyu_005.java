package Kata_7kyu;

/*
Shortest Word

Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.


https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
 */

public class Kata_7kyu_005 {
    public static int findShort(String s) {
        int result = s.length();
        int count = 0;
        char[] charArray = s.toCharArray();
        for(char c: charArray){
            if (c == ' '){
                if (count < result) {
                    result = count;
                }
                count = -1;
            }
            count++;
        }
        if (count < result) {
            result = count;
        }
        return result;
    }
}
