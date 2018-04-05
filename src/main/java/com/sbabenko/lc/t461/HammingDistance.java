package com.sbabenko.lc.t461;

/**
 * Created by Sem Babenko.
 */
public class HammingDistance {

  public int hammingDistance(int x, int y) {
    int res = 0;
    int cursor = 1;
    for (int i = 0; i < 32; i++, cursor <<= 1) {
      if ((x & cursor) != (y & cursor)) {
        res++;
      }
    }
    return res;
  }
}
