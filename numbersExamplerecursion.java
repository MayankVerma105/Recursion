public class numbersExamplerecursion {
    public static void main(String[] agrs) {
      print(1);
    }
    static void print(int n){
        if( n == 10){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
