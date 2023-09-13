package Kata_6kyu;
/*
Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!

The number 89 is the first integer with more than one digit that fulfills the property partially introduced in
the title of this kata. What's the use of saying "Eureka"? Because this sum gives
the same number: 89 = 8^1 + 9^2

The next number in having this property is 135:

See this property again: 135 = 1^1 + 3^2 + 5^3
Task

We need a function to collect these numbers, that may receive two integers aaa, bbb that defines the
range [a,b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills
the property described above.
Examples

Let's see some cases (input -> output):

1, 10  --> [1, 2, 3, 4, 5, 6, 7, 8, 9]
1, 100 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]

If there are no numbers of this kind in the range [a,b] the function should output an empty list.

90, 100 --> []

Enjoy it!!

 */

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class Kata_6kyu_003 {
    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List lst = new ArrayList();
        long sum;
        int[] digits;
        for (int i = 0; i <= b - a; i++){
            sum = 0;
            digits = Long.toString(a + i).chars().map(c -> c-'0').toArray();
            for (int j = 0; j < Long.toString(a+i).length(); j++){
                sum += pow(digits[j], j + 1);
            }
            if (sum == a + i) {
                lst.add(sum);
            }
        }

        return lst;
    }
}
