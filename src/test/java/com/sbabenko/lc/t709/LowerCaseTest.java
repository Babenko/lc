package com.sbabenko.lc.t709;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Created by Sem Babenko.
 */
class LowerCaseTest {

  private LowerCase wordCase = new LowerCase();

  @ParameterizedTest
  @ValueSource(strings = {"CAR", "Red", "worD"})
  void wordToLowerCase(String word) {

    String lower = word.toLowerCase();
    String result = wordCase.toLowerCase(word);

    assertEquals(lower, result);
  }

  @ParameterizedTest
  @ValueSource(strings = {"Super CAR", "Red Dress", "Cool worD"})
  void wordsToLowerCase(String words) {

    String lower = words.toLowerCase();
    String result = wordCase.toLowerCase(words);

    assertEquals(lower, result);
  }

}