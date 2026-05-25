package com.github.streams.practice.b_medium_problems.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Calculates the sum of unique elements in an array. <br>
 * Example: <br>
 * Input: [5, 6, 7, 8, 5, 5, 8, 8, 7]<br>
 * Output: 26
 */
class B_SumOfUniqueNumbers {

  @Test
  @Disabled
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    final var mySolution = MediumNumbersProblemSolution.sumOfUniqueNumbers(input);
    final var yourSolution = ThreadLocalRandom.current().nextLong();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
