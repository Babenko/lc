package com.sbabenko.lc.t344;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @ParameterizedTest
    @MethodSource("strings")
    void reverseString(String input, String expected) {

        var reverse = new ReverseString();

        var result = reverse.reverseString(input);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> strings() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("A man, a plan, a canal: Panama", "amanaP :lanac a ,nalp a ,nam A"));
    }

}