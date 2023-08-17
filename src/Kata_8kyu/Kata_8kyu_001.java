package Kata_8kyu;

/*
Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

Use conditionals to return the proper message:
case 	                    return
name equals owner 	        'Hello boss'
otherwise 	                'Hello guest'
*/
public class Kata_8kyu_001 {
    static String greet(String name, String owner) {
        // Add code here
        String result_string = "Hello guest";
        if (name == owner) {result_string = "Hello boss";};

        return result_string;
    }
}
