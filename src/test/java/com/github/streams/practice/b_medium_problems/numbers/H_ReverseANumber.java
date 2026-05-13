package com.github.streams.practice.b_medium_problems.numbers;

import com.github.streams.practice.b_medium_problems.numbers.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Reverses the digits of a given integer.
 *
 * <p>Example:<br>
 * Input: 1234<br>
 * Output: 4321
 */
class H_ReverseANumber {

  @Test
  @Disabled
  static void reverseANumber() {
    final var input = DummyData.fakerNumber();
    var mySolution = MediumNumbersProblemSolution.reverseANumber(input);
    int yourSolution = 0;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
