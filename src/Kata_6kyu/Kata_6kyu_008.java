package Kata_6kyu;

import java.util.ArrayList;

/*
Array.diff

Your goal in this kata is to implement a difference function, which subtracts one list from another
and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}

If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}


https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
 */
public class Kata_6kyu_008 {
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> listA = new ArrayList<>();
        for(int aValue: a){
            listA.add(aValue);
        }
        for(int bValue: b){
            while(listA.remove(Integer.valueOf(bValue)));
        }
        int[] result = new int[listA.size()];
        for(int i = 0; i < listA.size(); i++){
            result[i] = listA.get(i);
        }

        return result;
    }
}
