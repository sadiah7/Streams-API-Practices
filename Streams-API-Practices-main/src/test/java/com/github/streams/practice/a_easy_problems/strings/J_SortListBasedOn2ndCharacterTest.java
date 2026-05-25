package com.github.streams.practice.a_easy_problems.strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.datafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Sort a list of strings alphabetically by their second character.
 *
 * <p>Example: <br>
 * Input: ["banana", "apple", "cherry", "date"] <br>
 * Output: ["date", "banana", "cherry", "apple"] <br>
 * Explanation: Sorted by second character: 'a'(date), 'a'(banana), 'h'(cherry), 'p'(apple).
 */
class J_SortListBasedOn2ndCharacterTest {

  @Test
  void testSortListBasedOn2ndCharacter() {
    final var fakePersons = new Faker().name();
    List<String> input =
        List.of(
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name());

    List<String> mySolution = StringProblemsSolution.sortListBasedOn2ndCharacter(input);
    List<String> yourSolution = input.stream().sorted(Comparator.comparing(name -> name.charAt(1))).toList();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
