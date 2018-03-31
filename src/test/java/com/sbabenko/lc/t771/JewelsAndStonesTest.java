package com.sbabenko.lc.t771;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by Sem Babenko.
 */
class JewelsAndStonesTest {

  private JewelsAndStones jewelsAndStones = new JewelsAndStones();

  @Test
  void numJewelsInStonesContainsJewels() {

    var result = jewelsAndStones.numJewelsInStones("aA", "aAAbbbb");

    assertEquals(3, result);
  }

  @Test
  void numJewelsInStonesWithoutJewels() {

    var result = jewelsAndStones.numJewelsInStones("z", "ZZZ");
    assertEquals(0, result);
  }

  @Test
  void numJewelsInStonesWithNullInput() {

    var result = jewelsAndStones.numJewelsInStones(null, "s");
    assertEquals(0, result);
  }

}