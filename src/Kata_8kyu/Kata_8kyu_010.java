package Kata_8kyu;
/*
Reversed sequence

Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */

public class Kata_8kyu_010 {
    public static int[] reverse(int n){
        //your code
        int[] arr = new int[n];
        for (int i = n-1; i>=0; i--){
            arr[n-i-1] = i+1;
        }
        return arr;
    }
}
