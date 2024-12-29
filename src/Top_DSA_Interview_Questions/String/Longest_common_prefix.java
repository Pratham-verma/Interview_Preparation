package Top_DSA_Interview_Questions.String;

public class Longest_common_prefix {
    public static String longestcommonprefix(String[] s){
        int n = s.length;
        if (n == 0){
            return "";
        }
        String prefix = s[0];
        for (int i =0; i < n; i++){

            while (s[i].indexOf(prefix) != 0){

                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        String[] s = {"flower", "flight" , "flow"};

        System.out.print(longestcommonprefix(s));
    }
}
