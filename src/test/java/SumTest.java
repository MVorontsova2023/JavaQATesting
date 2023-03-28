import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
//import static java.lang.invoke.LambdaForm.arguments;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {
//    @ParameterizedTest
//    @MethodSource("validData")
//    void sumOfTwoNumbersValidDataPositive(int expectedResult, int a, int b) {
//        Sum sum = new Sum();
//        assertEquals(expectedResult, sum.sumOfTwoNumbers(a, b), "Actual result doesn't match to expected");
//    }
//
//    Stream<Arguments> validData() {
//        return Stream.of(
//                arguments(7, 5, 2),
//                arguments(-9, -5, -4),
//                arguments(-8, -2, -6),
//                arguments(3, 10, -7),
//                arguments(-3, 0, -3),
//                arguments(33, 0, 33),
//                arguments(0, 0, 0),
//                arguments(17300, 7000, 10300)
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("invalidData")
//    void sumOfTwoNumbersInvalidData(int expectedResult, int a, int b) {
//        Sum sum = new Sum();
//        assertNotEquals(expectedResult, sum.sumOfTwoNumbers(a, b), "Actual result doesn't match to expected");
//    }
//
//    Stream<Arguments> invalidData() {
//        return Stream.of(
//                arguments(4, 5, 2),
//                arguments(-2, -5, -4),
//                arguments(-12, -2, -6),
//                arguments(-3, 10, -7),
//                arguments(3, 0, -3),
//                arguments(103, 0, 33),
//                arguments(1, 0, 0),
//                arguments(15300, 7000, 10300)
//        );
//    }
    @Test
    void sumOfTwoNumbers() {
        assertEquals(4, Sum.sumOfTwoNumbers(2, 2));
    }
}