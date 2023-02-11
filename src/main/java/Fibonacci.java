import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

       new Fibonacci().fib();

    }

    void fib() {
        int a = 0, b = 1;
        int k =0;
        ArrayList<Integer>  list = new ArrayList<>();
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (k <= n) {
            k = a + b;
//            if (k>=n)
//                break;
            list.add(k);
            System.out.print(k +",");
            a = b;
            b = k;
        }

        System.out.println(list.size());
    }

}
