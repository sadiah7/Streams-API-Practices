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
 * Count the number of occurrences of each character in a string (spaces excluded).
 *
 * <p>Example: <br>
 * Input: "the quick brown fox jumps right over the little lazy dog little" <br>
 * Output: {'t'=5, 'h'=3, 'e'=5, 'q'=1, 'u'=2, ...} <br>
 * Explanation: Each character is mapped to how many times it appears in the string.
 */
class D_NumberOfOccurencesOfEachCharacterTest {
  @Test
  void numberOfOccurencesOfEachCharacter() {
    final String input = "the quick brown fox jumps right over the little lazy dog little";
    final var mySolution = StringProblemsSolution.findOccurenceOfCharacter(input);
    final Map<Character, Long> yourSolution = Arrays.stream(input.split(""))
    		.filter(chars -> !" ".equals(chars))
    		.collect(Collectors.groupingBy(obj -> obj.toCharArray()[0] ,LinkedHashMap::new, Collectors.counting()));

    assertEquals(mySolution, yourSolution);
  }
}
