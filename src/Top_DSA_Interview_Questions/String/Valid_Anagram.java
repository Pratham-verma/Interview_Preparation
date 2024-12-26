package Top_DSA_Interview_Questions.String;

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//
//
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//
//        Output: true
//
//        Example 2:
//
//        Input: s = "rat", t = "car"
//
//        Output: false

public class Valid_Anagram {
    public boolean valid(String s, String t){
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            int index1 = (int)(ch - 'a');
            arr[index1]++;
        }
        for (char ch : t.toCharArray()){
            int index2 = (int)(ch - 'a');
            arr[index2]--;
        }
        for (int i = 0; i < 26; i++){
            if (arr[i] != 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        Valid_Anagram ob = new Valid_Anagram();
        System.out.print(ob.valid(s,t));
    }
}
