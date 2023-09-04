package Kata_6kyu;
/*
Write Number in Expanded Form

You will be given a number and you will need to return it as a string in Expanded Form. For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

NOTE: All numbers will be whole numbers greater than 0.

If you liked this kata, check out part 2!!
 */
public class Kata_6kyu_001 {
    public static String expandedForm(int num)
    {
        //your code here
        String result = "";
        String snum = Integer.toString(num);
        int ipoint = 0;
        for (int j = 0; j < snum.length() - 1; j++){

            ipoint = snum.charAt(j) - '0';
            for (int i = 0; i < snum.length() - j - 1; i++){
                ipoint *= 10;
            }
            if (snum.charAt(j) != '0'){
                result += Integer.toString(ipoint) + " + ";
            }

        }
        if (snum.charAt(snum.length() - 1) != '0'){
            result += snum.charAt(snum.length() - 1);
        }
        if (snum.charAt(snum.length() - 1) == '0'){
            result = result.substring(0, result.length() - 3);
        }
        return result;
    }
}
