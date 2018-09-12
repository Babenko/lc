package com.sbabenko.lc.t709;

import java.io.ByteArrayOutputStream;

/**
 * Created by Sem Babenko.
 */
public class LowerCase {

  private static final int OFFSET = 32;
  private static final int LOW_BORDER = 64;
  private static final int UPPER_BORDER = 91;

  public String toLowerCase(String str) {

    return new String(str.codePoints().map(this::mapToLower)
            .collect(ByteArrayOutputStream::new,
                    (baos, val) -> baos.write((byte)val),
                    (b1, b2) -> b1.write(b2.toByteArray(), 0, b2.size())).toByteArray());
  }

  private int mapToLower(int val) {
    return val > LOW_BORDER && val < UPPER_BORDER ? val + OFFSET : val;
  }

}
