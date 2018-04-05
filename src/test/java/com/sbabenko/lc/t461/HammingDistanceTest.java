package com.sbabenko.lc.t461;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Sem Babenko.
 */
class HammingDistanceTest {

  @Test
  void hammingDistance() {

    var hammingDistance = new HammingDistance();
    Assertions.assertEquals(2, hammingDistance.hammingDistance(1, 4));

  }
}