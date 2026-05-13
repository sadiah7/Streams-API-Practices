package com.github.streams.practice.b_medium_problems.numbers;

import com.github.streams.practice.b_medium_problems.numbers.data.DummyData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Converts a 2D primitive int array into a {@code List<List<Integer>>}.
 *
 * <p>Example:<br>
 * Input: {{1, 2}, {3, 4}, {5, 6}}<br>
 * Output: [[1, 2], [3, 4], [5, 6]]
 */
public class K_IntArray2DToListConverter {
  @Test
  @Disabled
  void convertInt2DArrayToList() {
    final int[][] input = DummyData.random2DPrimitiveArray();

    var mySolution = MediumNumbersProblemSolution.convertInt2DArrayToList(input);
    var yourSolution = List.of(List.<Integer>of());

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
