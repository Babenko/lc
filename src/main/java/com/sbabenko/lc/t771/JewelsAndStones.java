package com.sbabenko.lc.t771;

import java.util.Objects;

/**
 * Created by Sem Babenko.
 */
public class JewelsAndStones {

  public int numJewelsInStones(String J, String S) {
    int result = 0;

    if (Objects.isNull(J) || Objects.isNull(S) || J.isEmpty() || S.isEmpty()) {
      return result;
    }

    for(int i = 0; i < J.length(); i++) {
      char ch = J.charAt(i);
      for (int j = 0; j < S.length(); j++) {
        if (S.charAt(j) == ch) {
          result++;
        }
      }
    }

    return result;
  }
}
