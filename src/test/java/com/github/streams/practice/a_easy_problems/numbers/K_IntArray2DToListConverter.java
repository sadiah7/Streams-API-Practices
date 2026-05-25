package com.github.streams.practice.a_easy_problems.numbers;

import com.github.streams.practice.a_easy_problems.numbers.data.DummyData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Convert a 2D integer array into a List of Lists of Integers using streams.
 *
 * <p>Example: <br>
 * Input: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} <br>
 * Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 */
public class K_IntArray2DToListConverter {
  @Test
  @Disabled
  void convertInt2DArrayToList() {
    final int[][] input = DummyData.random2DPrimitiveArray();

    var mySolution = EasyNumbersProblemSolution.convertInt2DArrayToList(input);
    var yourSolution = List.of(List.<Integer>of());

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
