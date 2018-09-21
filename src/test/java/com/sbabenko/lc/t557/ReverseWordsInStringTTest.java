package com.sbabenko.lc.t557;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTTest {

    @ParameterizedTest
    @MethodSource("words")
    void reverseWords(String input, String expected) {

        var reverseWords = new ReverseWordsInStringT();

        var result = reverseWords.reverseWords(input);

        Assertions.assertEquals(expected, result);
    }


    private static Stream<Arguments> words() {
        return Stream.of(
                Arguments.of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc" ));
    }
}