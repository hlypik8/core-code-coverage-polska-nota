package ru.yandex.javacourse;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    private final ReversePolishNotationCalculator rpn = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        assertEquals(7, rpn.calculatePolishNotation("3 4 +"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        assertEquals(12, rpn.calculatePolishNotation("3 4 *"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(-1, rpn.calculatePolishNotation("3 4 -"));
    }

    @Test
    public void shouldCalculateAdditionWithSpaces() {
        assertEquals(7, rpn.calculatePolishNotation("  3   4   +  "));
    }
}

