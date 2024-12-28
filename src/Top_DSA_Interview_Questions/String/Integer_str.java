package Top_DSA_Interview_Questions.String;

//  Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//
//
//        Example 1:
//
//        Input: haystack = "sadbutsad", needle = "sad"
//        Output: 0
//        Explanation: "sad" occurs at index 0 and 6.
//        The first occurrence is at index 0, so we return 0.
import java.util.*;

public class Integer_str {
    public static int str(String haystack , String needle){
         if (needle.isEmpty()) return 0;
         if (haystack.length() < needle.length()) return -1;
         for (int i = 0; i <= haystack.length()-needle.length(); i++){
             if (haystack.substring(i , i + needle.length()).equals(needle)){
                 return i;
             }
         }
         return -1;
    }
    public static void main(String[] args){
        String haystack = "leetcode";
        String needle = "leet";

        System.out.print(str(haystack,needle));
    }
}

//     haystack = "hello"
//     needle = "ll"

// 1	0	"he"	"he" != "ll"	Continue to next iteration
// 2	1	"el"	"el" != "ll"	Continue to next iteration
// 3	2	"ll"	"ll" == "ll"	Return i = 2
