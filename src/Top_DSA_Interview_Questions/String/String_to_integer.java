package Top_DSA_Interview_Questions.String;

Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

//        The algorithm for myAtoi(string s) is as follows:
//
//        Whitespace: Ignore any leading whitespace (" ").
//        Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
//        Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
//        Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
//
//        Return the integer as the final result.
//
//
//
//        Example 1:
//
//        Input: s = "42"
//
//        Output: 42
//
//        Explanation:
//
//        The underlined characters are what is read in and the caret is the current reader position.
//        Step 1: "42" (no characters read because there is no leading whitespace)
//        ^
//        Step 2: "42" (no characters read because there is neither a '-' nor '+')
//        ^
//        Step 3: "42" ("42" is read in)
//        ^
//
//        Example 2:
//
//        Input: s = " -042"
//
//        Output: -42
//
//        Explanation:
//
//        Step 1: "   -042" (leading whitespace is read and ignored)
//        ^
//        Step 2: "   -042" ('-' is read, so the result should be negative)
//        ^
//        Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
//        ^
//

public class String_to_integer {
     public static int myAtoi(String s){
          int int_max = 2147483647;
          int int_min = -2147483648;
          int sign = 1;
          int ans = 0;
          int i = 0;
          int n = s.length();

          // skiping the whitespace ' '
          while(i < n && s.charAt(i) == ' '){
               i++;
          }
          // check for optional sign
          if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
               sign = s.charAt(i) == '-' ? -1 : 1;
               i++;
          }

          // convert digits to integer
          while (i < n && Character.isdigit(s.charAt(i))){
               int digit = s.charAt(i) - '0';

               //check for overflow
               if (ans > (int_max - digit)/10) {
                    return sign == -1 ? int_max : int_min;
               }
               ans = ans * 10 + digit;
               i++;
          }
          return sign * ans;
     }
     public static void main(String[] args){
          String s = "-42";

          System.out.print(myAtoi(s));
     }
}
