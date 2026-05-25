package com.github.streams.practice.a_easy_problems.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Reverse a string that may contain special characters and Unicode (e.g., emojis).
 *
 * <p>Example: <br>
 * Input: "Hello world! This is a test. 😅" <br>
 * Output: "😅 .tset a si sihT !dlrow olleH"
 */
class H_ReverseStringWithSpecialCharactersTest {

  @Test
  void testReverseStringWithSpecialCharactersTest() {
    var input = "Hello world! This is a test. 😅";
    var mySolution = StringProblemsSolution.reverseStringWithSpecialCharacters(input);

//    var yourSolution = Arrays.stream(input.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
    var yourSolution = input.chars()
    		.mapToObj(x-> String.valueOf((char) x))
    		.reduce((a,b) -> b+a).get();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
