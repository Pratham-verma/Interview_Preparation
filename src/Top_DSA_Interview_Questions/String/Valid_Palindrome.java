package Top_DSA_Interview_Questions.String;

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.

public class Valid_Palindrome {
    public static boolean ispalindrome(String s){
        if (s.isEmpty()){
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last){
            char currfirst = s.charAt(start);
            char currlast = s.charAt(last);

            if (!Character.isLetterOrDigit(currfirst)){
                start++;
            }
            else if (!Character.isLetterOrDigit(currlast)){
                last--;
            }
            else {
                if (Character.toLowerCase(currfirst) != Character.toLowerCase(currlast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.print(ispalindrome(s));
    }
}
