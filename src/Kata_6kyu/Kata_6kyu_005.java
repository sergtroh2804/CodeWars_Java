package Kata_6kyu;
/*
Find the odd int


Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
Examples

[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

 */

import java.util.*;
import java.util.stream.Collectors;

public class Kata_6kyu_005 {
    public static int findIt(int[] a) {
        int odd = a[0];
        List<Integer> list = new ArrayList<>();
        Set<Integer> aSet = new HashSet<>();
        for (Integer i: a){
            list.add(i);
            aSet.add(i);
        }
        int[] aCount = new int[aSet.toArray().length];
        int z = 0;
        for(Integer i: aSet){
            aCount[z] = Collections.frequency(list, i);
            if (aCount[z] % 2 == 1){
                odd = i;
            }
            z++;
        }
        return odd;
    }
}
