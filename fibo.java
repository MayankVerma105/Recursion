public class fibo {
    public static void main(String[] agrs) {
        System.out.println(fibonacci(6));
    }

    static int fibonacci(int n){
        if(n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
}
