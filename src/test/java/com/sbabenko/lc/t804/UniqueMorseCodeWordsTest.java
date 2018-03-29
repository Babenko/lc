package com.sbabenko.lc.t804;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Sem Babenko.
 */
class UniqueMorseCodeWordsTest {

  @Test
  void uniqueMorseRepresentations() {

    var uniqueMorseCodeWords = new UniqueMorseCodeWords();
    var result = uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});

    assertEquals(2, result);
  }

}