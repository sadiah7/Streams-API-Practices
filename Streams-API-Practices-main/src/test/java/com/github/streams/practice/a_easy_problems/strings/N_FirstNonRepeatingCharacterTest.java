package com.github.streams.practice.a_easy_problems.strings;

import com.github.streams.practice.b_medium_problems.ProblemSolutions;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Find the first character in a string that does not repeat anywhere else in the string.
 * (Classic Google interview question)
 *
 * <p>Example: <br>
 * Input: "The quick brown fox jumps over the lazy dog, find the first non repeated character." <br>
 * Output: 'T' <br>
 * Explanation: 'T' appears only once and is the first such character from the left.
 */
class N_FirstNonRepeatingCharacterTest {
    @Test
    void testFirstNonRepeatingCharacter() {
        final var input =
                "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
        final var yourSolution = input.chars()
        		.mapToObj(c -> (char) c)
        		.filter(c -> !Character.isSpace(c))
        		.collect(Collectors.groupingBy(Function.identity()))
        		.values()
        		.stream()
        		.filter(s -> s.size() == 1)
        		.map(s -> s.get(0))
        		.toList().get(0);
        final var mySolution = ProblemSolutions.firstNonRepeatingCharacter(input);

        Assertions.assertEquals(mySolution, yourSolution);
    }
}
