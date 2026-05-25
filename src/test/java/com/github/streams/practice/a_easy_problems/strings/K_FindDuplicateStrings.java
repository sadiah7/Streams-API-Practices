package com.github.streams.practice.a_easy_problems.strings;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Find all strings that appear more than once in a list.
 *
 * <p>Example: <br>
 * Input: ["Hellow", "World", "How", "are", "you", "How", "are", "you"] <br>
 * Output: ["How", "are", "you"] <br>
 * Explanation: "How", "are", and "you" each appear twice; "Hellow" and "World" appear once.
 */
class K_FindDuplicateStrings {
  @Test
  @Disabled
  void findDuplicateStrings() {
    final var input = List.of("Hellow", "World", "How", "are", "you", "How", "are", "you");
    final var mySolution = StringProblemsSolution.findDuplicateStrings(input);
    final var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
