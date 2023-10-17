package Kata_7kyu;

/*
Isograms

An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function
that determines whether a string that contains only letters is an isogram. Assume the empty string
is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false

 */

import java.util.*;
import java.util.stream.*;

public class Kata_7kyu_004 {
    public static boolean isIsogram(String str) {
        // ...
        str = str.toLowerCase();
        Set<Character> charsSet = str.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        Boolean result = false;
        if (str.length() == charsSet.size()) {
            result = true;
        }
        return result;
    }
}
