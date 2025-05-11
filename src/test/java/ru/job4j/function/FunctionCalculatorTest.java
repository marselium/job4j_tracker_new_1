package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenQuadroFunctionThenQuadroResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(2, 4, x -> 2 * x * x + 3 * x + 1);
        List<Double> expected = Arrays.asList(15D, 28D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenSqrtFunctionThenSqrtResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(2, 4, Math::sqrt);
        List<Double> expected = Arrays.asList(Math.sqrt(2), Math.sqrt(3));
        assertThat(result).containsAll(expected);
    }
}