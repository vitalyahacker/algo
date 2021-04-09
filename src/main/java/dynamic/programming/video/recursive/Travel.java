package dynamic.programming.video.recursive;

import java.util.Map;

public class Travel {
    public static long travel(long x, long y, Map<Pair<Long, Long>, Long> memo) {
        if (x == 0 || y == 0) {
            return 0;
        }
        if (x == 1 && y == 1) {
            return 1;
        }
        if (memo.containsKey(Pair.of(x, y))) {
            return memo.get(Pair.of(x, y));
        }
        if (memo.containsKey(Pair.of(y, x))) {
            return memo.get(Pair.of(y, x));
        }
        long result = travel(x - 1, y, memo) + travel(x, y - 1, memo);
        memo.put(Pair.of(x, y), result);
        memo.put(Pair.of(y, x), result);
        return result;
    }
}
