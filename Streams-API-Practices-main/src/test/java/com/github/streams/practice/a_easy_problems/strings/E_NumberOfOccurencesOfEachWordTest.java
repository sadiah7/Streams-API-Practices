package com.github.streams.practice.a_easy_problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Count the number of occurrences of each word in a string.
 *
 * <p>Example: <br>
 * Input: "the quick brown fox jumps right over the little lazy dog little" <br>
 * Output: {"the"=2, "little"=2, "quick"=1, "brown"=1, ...} <br>
 * Explanation: Each word is mapped to how many times it appears in the string.
 */
class E_NumberOfOccurencesOfEachWordTest {
  @Test
  public void numberOfOccurencesOfEachWord() {
    final var input = "the quick brown fox jumps right over the little lazy dog little";
    final Map<String, Long> mySolution = StringProblemsSolution.numberOfOccurenceOfEachWord(input);

    Map<String, Long> yourSolution = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()));
    assertEquals(mySolution, yourSolution);
  }
}
