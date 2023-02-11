import java.util.ArrayList;

public class FibonacciBySize {
    public static void main(String[] args) {
        System.out.println(new FibonacciBySize().fib(3));
       // new FibonacciBySize().fib(3);
    }

    int fib(int n){
        if (n<=1)
            return n;
        int a = 0, b=1, k=0;
        while (n-- >1){
            k=a+b;
            a=b;
            b=k;
        }

        return k;
    }
}
