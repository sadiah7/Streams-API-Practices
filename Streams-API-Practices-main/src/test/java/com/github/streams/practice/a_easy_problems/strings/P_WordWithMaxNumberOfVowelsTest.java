package com.github.streams.practice.a_easy_problems.strings;

import com.github.streams.practice.b_medium_problems.ProblemSolutions;
import net.datafaker.Faker;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given a string, find the highest number of vowels present in any single word.
 *
 * <p>Example: <br>
 * Input: "HELLO HOW ARE YOU" <br>
 * Output: 2 <br>
 * Explanation: "HELLO" contains 2 vowels (E, O), which is the most of any word in the string.
 */
class P_WordWithMaxNumberOfVowelsTest {
  @Test
  void testNumberOfVowels() {
    var input = new Faker().chuckNorris().fact();
    final var mySolution = ProblemSolutions.maxNumberOfVowels(input);
    final var yourSolution = Arrays.stream(input.split(" ")).map(word ->word.length() - word.replaceAll("[aeiouAEIOU]", "").length())
    		.max((a,b)-> a-b)
    		.get();
    		
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
