import java.util.*;

public class Fibonacci {
    Fibonacci() { }

    public int recursive(int in) {
        if (in == 0) {
            return 0;
        } else if (in == 1) {
            return 1;
        } else {
            return (recursive(in - 1) + recursive(in - 2));
        }
    }

    public int iterative(int in) {
        int f1 = 1, f2 = 0;
        int ergebnis = 0;
        for (int i = 1; i <= in; i++) {
            ergebnis = f1 + f2;
            f1 = f2;
            f2 = ergebnis;
        }
        return ergebnis;
    }

    public static void main(String[] args) throws Exception {
        Fibonacci fib = new Fibonacci();
        System.out.println("Recursive " + fib.recursive(10));
        System.out.println("Iterative " + fib.iterative(10));
    }
}
