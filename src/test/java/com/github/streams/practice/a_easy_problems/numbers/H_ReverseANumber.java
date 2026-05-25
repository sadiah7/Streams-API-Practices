package com.github.streams.practice.a_easy_problems.numbers;

import com.github.streams.practice.a_easy_problems.numbers.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Reverse the digits of an integer.
 *
 * <p>Example: <br>
 * Input: 12345 <br>
 * Output: 54321
 */
class H_ReverseANumber {

  @Test
  @Disabled
  static void reverseANumber() {
    final var input = DummyData.fakerNumber();
    var mySolution = EasyNumbersProblemSolution.reverseANumber(input);
    int yourSolution = 0;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
