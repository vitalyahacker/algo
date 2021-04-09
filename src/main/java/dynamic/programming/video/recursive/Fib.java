package dynamic.programming.video.recursive;

import java.util.Map;

public class Fib {
    public static long fib(int n, Map<Integer, Long> memo) {
        if (n <= 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);
        return result;
    }

}
