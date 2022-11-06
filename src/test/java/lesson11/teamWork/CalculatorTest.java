package lesson11.teamWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void test_twoPlusTwoEqualsFour() {
        //given line->9
        //when
        int add = calculator.add(2, 2);
        //then
        assertEquals(4,add );
    }

    @Test
    void test_subTwoMinusEqualsTwo() {
        //given line->9
        //when
        int sub = calculator.sub(4, 2);
        //then
        assertEquals(2, sub);
    }

    @Test
    void test_multFourByTwoEqualsEight() {
        //given line->9
        //when
        int mult = calculator.mult(4, 2);
        //then
        assertEquals(8, mult);
    }

    @Test
    void test_divEightDivByTwo() {
        //when&Then together
        assertEquals(4, calculator.div(8, 2));
    }

    @Test
    void test_divByZeroNotPossible() {
        assertEquals(0, calculator.div(8, 0));
    }

    @Test
    void test_areaOfSqueareCalc() {
        assertEquals(28, calculator.calculateAreaOfSquare(3));
    }
}