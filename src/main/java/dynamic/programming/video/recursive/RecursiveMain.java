package dynamic.programming.video.recursive;

import java.util.*;

import static dynamic.programming.video.recursive.Construct.*;
import static dynamic.programming.video.recursive.Fib.fib;
import static dynamic.programming.video.recursive.Sum.*;
import static dynamic.programming.video.recursive.Travel.travel;

//

/**
 * <a href="https://www.youtube.com/watch?v=oBt53YbR9Kk&t=5365s&ab_channel=freeCodeCamp.org">
 * Free code camp video I took all these tasks from
 * </a>
 */
public class RecursiveMain {

    public static void main(String[] args) {

        System.out.println(fib(5000, new HashMap<>()));
        System.out.println(travel(345L, 666L, new HashMap<>()));

        System.out.println(canSum(30, List.of(7, 14)));
        System.out.println(canSum(56, List.of(7, 14)));
        System.out.println(canSum(240, List.of(2)));
        System.out.println(canSum(300, List.of(7, 14)));

        System.out.println(howSum(30, List.of(7, 14)));
        System.out.println(howSum(28, List.of(7, 14)));
        System.out.println(howSum(28, List.of(3, 2)));
        System.out.println(howSum(287, List.of(7, 14)));

        System.out.println(bestSum(7, List.of(5, 4, 3, 7)));
        System.out.println(bestSum(8, List.of(1, 4, 5)));
        System.out.println(bestSum(100, List.of(25, 1, 2, 5)));
        System.out.println(bestSum(300, List.of(1, 2, 50)));

        System.out.println(canConstruct("abcdef", List.of("def", "ab", "c")));
        System.out.println(canConstruct("abcdefv", List.of("def", "ab", "c")));
        System.out.println(canConstruct("abcdefv", List.of("def", "ab", "de", "fv")));
        System.out.println(canConstruct("abcdefv", List.of("def", "ab", "de", "abc", "fv")));
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                List.of("e", "ee", "eee", "eeee", "eeeee", "eeeeee", "eeeeeef")));

        System.out.println(countConstruct("abcdef", List.of("def", "ab", "c")));
        System.out.println(countConstruct("abcdefv", List.of("def", "ab", "c")));
        System.out.println(countConstruct("abcdefv", List.of("def", "ab", "de", "fv")));
        System.out.println(countConstruct("abcdefv", List.of("def", "ab", "de", "abc", "fv")));
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeef",
                List.of("e", "ee", "eee", "eeee", "eeeee", "eeeeeef")));

        System.out.println(allConstruct("abcdef", List.of("ab", "abc", "de", "def", "f", "c")));
        System.out.println(allConstruct("purple", List.of("purp", "p", "ur", "le", "purpl")));
        System.out.println(allConstruct("skateboard", List.of("bo", "rd", "ate", "t", "ska", "sk", "boar")));
        System.out.println(allConstruct("aaaaaaaaaaaaaaaaaz", List.of("a", "aa", "aaaz", "aaaa", "aaaaa")));
    }


}