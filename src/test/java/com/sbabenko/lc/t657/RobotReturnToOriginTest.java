package com.sbabenko.lc.t657;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RobotReturnToOriginTest {

    private RobotReturnToOrigin robotReturnToOrigin = new RobotReturnToOrigin();

    @ParameterizedTest
    @ValueSource(strings = {"UD", "RL", "LR", "DU", "ULDR", "UDDU"})
    void judgeCircleWithSimpleTrueResult(String path) {

        Assertions.assertTrue(robotReturnToOrigin.judgeCircle(path));

    }


    @ParameterizedTest
    @ValueSource(strings = {"DD", "RR", "DDRR", "UUD", "UUDDDUR"})
    void judgeCircleWithSimpleFalseResult(String path) {

        Assertions.assertFalse(robotReturnToOrigin.judgeCircle(path));
    }
}