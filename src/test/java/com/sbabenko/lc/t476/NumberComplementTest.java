package com.sbabenko.lc.t476;

import com.sbabenko.lc.t700.SearchBinarySearchTree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberComplementTest {

    @ParameterizedTest
    @MethodSource("numbers")
    void findComplement(int input, int expected) {

        var numberComplement = new NumberComplement();

        var result = numberComplement.findComplement(input);

        assertEquals(expected, result);
    }


    private static Stream<Arguments> numbers() {
        return Stream.of(Arguments.of(5, 2), Arguments.of(1, 0), Arguments.of(2, 1));
    }
}