package dynamic.programming.video.iterative;

import java.util.Arrays;

public class IterativeMain {
    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(50));
        System.out.println(fib(400));
    }

    public static long fib(int n) {
        long[] values = new long[n + 1];
        Arrays.fill(values, 0);
        values[1] = 1;

        for (int i = 0; i < n; i++) {
            if (i + 1 <= n)
                values[i + 1] += values[i];
            if (i + 2 <= n)
                values[i + 2] += values[i];
        }
        return values[n];
    }
}
