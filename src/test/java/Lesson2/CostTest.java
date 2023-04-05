package Lesson2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CostTest {

    @Test
    void deliveryCostCalc() {
        Cost cost = new Cost();
        assertEquals(400,
                cost.deliveryCostCalc(2,true,false, "высокая"));
    }

    @Test
    void deliveryCostCalc1() {
        Cost cost = new Cost();
        assertEquals(980,
                cost.deliveryCostCalc(30,true,true, "высокая"));
    }

    @ParameterizedTest
    @MethodSource("validDataPos")
    void deliveryCostCalcPos(int result, double distance, boolean big, boolean fragile, String load) {
        Cost cost = new Cost();
        assertEquals( result, cost.deliveryCostCalc(distance,big,fragile, load));
    }

    static Stream<Arguments> validDataPos() {
        return Stream.of (
                arguments(770, 0,true,true, "высокая"),
                arguments(770, 0.1,true,true, "высокая"),
                arguments(770, 1.9,true,true, "высокая"),
                arguments(770, 2.0,true,true, "высокая"),
                arguments(840, 2.1,true,true, "высокая"),
                arguments(840, 6.6,true,true, "высокая"),
                arguments(840, 9.9,true,true, "высокая"),
                arguments(840, 10.0,true,true, "высокая"),
                arguments(980, 10.1,true,true, "высокая"),
                arguments(980, 15.0,true,true, "высокая"),
                arguments(980, 29.9,true,true, "высокая"),
                arguments(700, 30.1,true,false, "высокая"),
                arguments(700, 45.0,true,false, "высокая"),
                arguments(630, 0,false,true, "высокая"),
                arguments(630, 0.1,false,true, "высокая"),
                arguments(630, 1.9,false,true, "высокая"),
                arguments(630, 2.0,false,true, "высокая"),
                arguments(700, 2.1,false,true, "высокая"),
                arguments(700, 6.6,false,true, "высокая"),
                arguments(700, 9.9,false,true, "высокая"),
                arguments(700, 10.0,false,true, "высокая"),
                arguments(840, 10.1,false,true, "высокая"),
                arguments(840, 15.0,false,true, "высокая"),
                arguments(840, 29.9,false,true, "высокая"),
                arguments(560, 30.1,false,false, "высокая"),
                arguments(560, 45.0,false,false, "высокая")
        );
    }

    @ParameterizedTest
    @MethodSource("validDataNegative")
    void deliveryCostCalcNegative(int result, double distance, boolean big, boolean fragile, String load) {
        Cost cost = new Cost();
        assertEquals( result, cost.deliveryCostCalc(distance,big,fragile, load));
    }

    static Stream<Arguments> validDataNegative() {
        return Stream.of (
                arguments(840, -29.9,true,true, "высокая"),
                arguments(560, 30.1,true,true, "высокая"),
                arguments(560, 45.0,true,true, "высокая")
        );
    }
}