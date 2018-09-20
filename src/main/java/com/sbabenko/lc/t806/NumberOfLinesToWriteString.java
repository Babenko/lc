package com.sbabenko.lc.t806;

public class NumberOfLinesToWriteString {

    private static final int OFFSET = 97;
    private static final int LINE_LENGTH = 100;

    public int[] numberOfLines(int[] widths, String letters) {

        int lines = 0;
        int currentLineCapacity = 0;

        for (int i = 0; i < letters.length(); i++) {
            int capacity = widths[letters.charAt(i) - OFFSET];
            if (currentLineCapacity + capacity <= LINE_LENGTH) {
                currentLineCapacity += capacity;
            } else {
                lines++;
                currentLineCapacity = capacity;
            }
        }

        return new int[] {currentLineCapacity > 0 ? ++lines : lines, currentLineCapacity};
    }
}
