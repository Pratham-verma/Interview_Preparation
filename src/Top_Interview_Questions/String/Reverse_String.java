package Top_Interview_Questions.String;

//  Write a function that reverses a string. The input string is given as an array of characters s.
//
//  You must do this by modifying the input array in-place with O(1) extra memory.
//
//   Example 1:
//
//    Input: s = ["h","e","l","l","o"]
//    Output: ["o","l","l","e","h"]
//
//   Example 2:
//
//    Input: s = ["H","a","n","n","a","h"]
//    Output: ["h","a","n","n","a","H"]

public class Reverse_String {
    public static  void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.print(s);
    }
    public static void main(String args[]){
        char[] nums = {'H','a','n','n','a','h'};

        reverseString(nums);
    }
}
