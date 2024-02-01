package Kata_6kyu;

import java.util.ArrayList;
import java.util.Arrays;

/*
Make the Deadfish Swim

Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

    i increments the value (initially 0)
    d decrements the value
    s squares the value
    o outputs the value into the return array

Invalid characters should be ignored.

Deadfish.parse("iiisdoso") =- new int[] {8, 64};


https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java
 */

public class Kata_6kyu_009 {
    public static int[] parse(String data) {
        // Implement me! :)
        ArrayList<Integer> result = new ArrayList<>();
        int x = 0;
        for (char ch: data.toCharArray()){
            switch(ch){
                case 'i':
                    x++;
                    break;
                case 'd':
                    x--;
                    break;
                case 's':
                    x = x*x;
                    break;
                case 'o':
                    result.add(x);
                    break;
            }
        }
        Integer[] arr1 = new Integer[result.size()];
        arr1 = result.toArray(arr1);
        int[] arr2 = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}
