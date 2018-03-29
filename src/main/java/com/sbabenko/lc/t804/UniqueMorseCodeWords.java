package com.sbabenko.lc.t804;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sem Babenko.
 */
public class UniqueMorseCodeWords {

  private static final int CHARACTER_OFFSET = 96;

  private String[] morseAlphabet =
      {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
          "-.", "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


  public int uniqueMorseRepresentations(String[] words) {
    Set<String> result = new HashSet<>();
    for (String word : words) {
      StringBuilder newMorseWord = new StringBuilder();
      for (int j = 0; j < word.length(); j++) {
        int morseIndex = word.charAt(j) - CHARACTER_OFFSET;
        newMorseWord.append(morseAlphabet[morseIndex]);
      }
      result.add(newMorseWord.toString());
    }
    return result.size();
  }
}
