package dynamic.programming.video.recursive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sum {
    public static boolean canSum(int totalSum, List<Integer> numbers) {
        return canSum(totalSum, numbers, new HashMap<>());
    }

    public static boolean canSum(int totalSum, List<Integer> numbers, Map<Integer, Boolean> memo) {
        if (totalSum == 0) return true;
        if (totalSum < 0) return false;
        if (memo.containsKey(totalSum)) return memo.get(totalSum);

        for (int number : numbers) {
            int remainder = totalSum - number;
            if (canSum(remainder, numbers, memo)) {
                memo.put(remainder, true);
                return true;
            }
        }
        memo.put(totalSum, false);
        return false;
    }

    public static List<Integer> howSum(int totalSum, List<Integer> numbers) {
        return howSum(totalSum, numbers, new HashMap<>());
    }

    public static List<Integer> howSum(int totalSum, List<Integer> numbers, Map<Integer, List<Integer>> memo) {
        if (totalSum == 0) return new ArrayList<>();
        if (totalSum < 0) return null;
        if (memo.containsKey(totalSum)) return memo.get(totalSum);

        for (int number : numbers) {
            int remainder = totalSum - number;
            List<Integer> howSum = howSum(remainder, numbers, memo);
            if (howSum != null) {
                List<Integer> result = new ArrayList<>(howSum);
                result.add(number);
                memo.put(remainder, result);
                return result;
            }
        }
        memo.put(totalSum, null);
        return null;
    }

    public static List<Integer> bestSum(int totalSum, List<Integer> numbers) {
        return bestSum(totalSum, numbers, new HashMap<>());
    }

    public static List<Integer> bestSum(int totalSum, List<Integer> numbers, Map<Integer, List<Integer>> memo) {
        if (totalSum == 0) return new ArrayList<>();
        if (totalSum < 0) return null;
        if (memo.containsKey(totalSum)) return memo.get(totalSum);

        List<Integer> solution = null;

        for (int number : numbers) {
            int remainder = totalSum - number;
            List<Integer> bestSum = bestSum(remainder, numbers, memo);
            if (bestSum != null) {
                List<Integer> currentBestSum = new ArrayList<>(bestSum);
                currentBestSum.add(number);

                if (solution == null || solution.size() > currentBestSum.size()) {
                    solution = currentBestSum;
                }
            }
        }
        memo.put(totalSum, solution);
        return solution;
    }

}
