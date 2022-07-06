public class Nto1 {
    public static void main(String[] args) {
        n1(5);
        n2(5);
    }
    // static void n1(int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     n1(n-1);
    // }

    // static void n2(int n) {
    //     if (n == 0) {
    //         return;
    //     }
        
    //     n2(n-1);
    //     System.out.println(n);
    // }

    static void n1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        n1(n-1);
        
    }
    static void n2(int n) {
        if (n == 0) {
            return;
        }
        
        n2(n-1);
        System.out.println(n);
    }
}
