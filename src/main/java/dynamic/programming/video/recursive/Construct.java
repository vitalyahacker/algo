package dynamic.programming.video.recursive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Construct {
    public static boolean canConstruct(String targetString, List<String> wordBank) {
        return canConstruct(targetString, wordBank, new HashMap<>());
    }

    public static boolean canConstruct(String targetString, List<String> wordBank, Map<String, Boolean> memo) {
        if (targetString.isBlank()) return true;
        if (memo.containsKey(targetString)) return memo.get(targetString);

        for (String word : wordBank) {
            if (targetString.startsWith(word)) {
                String remainder = targetString.replaceFirst(word, "");
                boolean canConstruct = canConstruct(remainder, wordBank, memo);
                memo.put(targetString, canConstruct);
                if (canConstruct) return true;
            }
        }
        memo.put(targetString, false);
        return false;
    }

    public static int countConstruct(String targetString, List<String> wordBank) {
        return countConstruct(targetString, wordBank, new HashMap<>());
    }

    public static int countConstruct(String targetString, List<String> wordBank, Map<String, Integer> memo) {
        if (targetString.isBlank()) return 1;
        if (memo.containsKey(targetString)) return memo.get(targetString);

        int counter = 0;
        for (String word : wordBank) {
            if (targetString.startsWith(word)) {
                String remainder = targetString.replaceFirst(word, "");
                int countConstruct = countConstruct(remainder, wordBank);
                memo.put(remainder, countConstruct);
                counter += countConstruct;
            }
        }
        memo.put(targetString, counter);
        return counter;
    }


    public static List<List<String>> allConstruct(
            String targetString,
            List<String> wordBank
    ) {
        if (targetString.isBlank()) {
            List<List<String>> lists = new ArrayList<>();
            lists.add(new ArrayList<>());
            return lists;
        }

        List<List<String>> allConstructResult = new ArrayList<>();

        for (String word : wordBank) {
            if (targetString.startsWith(word)) {
                String remainder = targetString.replaceFirst(word, "");

                List<List<String>> allConstruct = allConstruct(remainder, wordBank);
                for (List<String> construct : allConstruct) {
                    construct.add(word);
                }
                allConstructResult.addAll(allConstruct);
            }
        }

        return allConstructResult;
    }
}
