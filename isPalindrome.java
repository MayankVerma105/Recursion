public class isPalindrome {
    static int reverse(int n) { 
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);  
    }

    private static int helper(int n, int digits) {
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + helper(n / 10, digits - 1);
    }

    static boolean Palindrome(int n) {
        return (n == reverse(n));
    }  
   
    public static void main(String[] args) {
        System.out.println(Palindrome(12331));
    }
   
}

