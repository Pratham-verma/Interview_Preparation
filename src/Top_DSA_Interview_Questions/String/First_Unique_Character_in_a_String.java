package Top_DSA_Interview_Questions.String;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//
//
//        Example 1:
//
//        Input: s = "leetcode"
//
//        Output: 0
//
//        Explanation:
//
//        The character 'l' at index 0 is the first character that does not occur at any other index.

import java.util.*;
public class First_Unique_Character_in_a_String {
    public static void unique(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < s.length(); i++){
            if ( 1 == map.get(s.charAt(i))){
                // if all unique char. bole the function void bnao or yhi pe print krlo
                // if first unique bole to hume integer function bnana ha or direct return kr dena ha 1st milte hi
                // return i;
                System.out.println("the index of unique character is" + " " + i);
            }
        }
    }
    public static void main(String[] args){
        String s = "leetcode";

        unique(s);
    }
}
