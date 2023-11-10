package Kata_6kyu;

/*
Give me a Diamond

Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James.
Since James doesn't know how to make this happen, he needs your help.
Task

You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
Trailing spaces should be removed, and every line must be terminated with a newline character (\n).

Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond
of even or negative size.

Examples

A size 3 diamond:

 *
***
 *

...which would appear as a string of " *\n***\n *\n"

A size 5 diamond:

  *
 ***
*****
 ***
  *

...that is:

"  *\n ***\n*****\n ***\n  *\n"


 */
public class Kata_6kyu_004 {
    public static String print(int n) {
        // TODO your code here
        String result = null;
        String result_temp = "";
        String space = "";
        String str = "";
        if ((n % 2 != 0) && (n > 0)) {
            result = "";
            for(int i = 0; i < n; i++){
                result += "*";
            }
            result += "\n";
            n -= 2;
            while (n > 0){
                space += " ";
                result_temp = "";
                str = "";
                for(int i = 0; i < n; i++){
                    result_temp += "*";
                }

                str += space;
                str += result_temp;
                str += "\n";

                result = str + result + str;

                n -= 2;

            }
        }
        return result;
    }
}
