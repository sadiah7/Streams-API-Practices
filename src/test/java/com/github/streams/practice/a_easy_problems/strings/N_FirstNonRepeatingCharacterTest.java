package com.github.streams.practice.a_easy_problems.strings;

import com.github.streams.practice.b_medium_problems.ProblemSolutions;
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
    @Disabled
    void testFirstNonRepeatingCharacter() {
        final var input =
                "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
        final var yourSolution = ' ';
        final var mySolution = ProblemSolutions.firstNonRepeatingCharacter(input);

        Assertions.assertEquals(mySolution, yourSolution);
    }
}
