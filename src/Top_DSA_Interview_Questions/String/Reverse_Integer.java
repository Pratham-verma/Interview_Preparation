package Top_DSA_Interview_Questions.String;

public class Reverse_Integer {
    public int reverse(int x){
        int ans = 0;
        while (x != 0){
            // fetch the last digit of x (remainder)
            int digit = x % 10;
            // check the overflow and underflow
            if (ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10) return 0;
           // Append the digit to the reversed number
            ans = ans * 10 + digit;
            // Remove the last digit from x
            x = x /10;
        }
        return ans;
    }
    public static void main(String[] args){
        int x = 123;

        Reverse_Integer ob = new Reverse_Integer();
        System.out.print(ob.reverse(x));
    }
}
