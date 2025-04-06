package dev.patika.definexjavaspringbootbootcamp2025.hw2.tests;

import dev.patika.definexjavaspringbootbootcamp2025.hw2.IntegerScientificCalculator;
import dev.patika.definexjavaspringbootbootcamp2025.hw2.ZeroDivisionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerScientificCalculatorTest {

    ClassPathXmlApplicationContext context;
    private IntegerScientificCalculator isCalculator1;
    private IntegerScientificCalculator isCalculator2;
    private IntegerScientificCalculator isCalculator3;
    private IntegerScientificCalculator isCalculator4;

    @BeforeEach
    public void setUp() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        isCalculator1 = context.getBean("isCalculator1", IntegerScientificCalculator.class);
        isCalculator2 = context.getBean("isCalculator1", IntegerScientificCalculator.class);

        isCalculator3 = context.getBean("isCalculator2", IntegerScientificCalculator.class);
        isCalculator4 = context.getBean("isCalculator2", IntegerScientificCalculator.class);
    }

    @Test
    public void testAdd() {

        int augend1 = 2;
        int addend1 = 3;

        int augend2 = 12;
        int addend2 = 34;

        int augend3 = 84;
        int addend3 = 23;

        int augend4 = 101;
        int addend4 = 200;

        isCalculator1.add(augend1, addend1);
        isCalculator2.add(augend2, addend2);
        isCalculator3.add(augend3, addend3);
        isCalculator4.add(augend4, addend4);

        int expected = 46;
        int expected3 = 107;
        int expected4 = 301;
        int actual1 = isCalculator1.getResult();
        int actual2 = isCalculator2.getResult();
        int actual3 = isCalculator3.getResult();
        int actual4 = isCalculator4.getResult();

        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);

        context.close();
    }

    @Test
    public void testSubstract() {
        int minuend1 = 108;
        int subtrahend1 = 50;

        int minuend2 = 40;
        int subtrahend2 = 18;

        int minuend3 = 84;
        int subtrahend3 = 23;

        int minuend4 = 302;
        int subtrahend4 = 102;

        isCalculator1.substract(minuend1, subtrahend1);
        isCalculator2.substract(minuend2, subtrahend2);
        isCalculator3.substract(minuend3, subtrahend3);
        isCalculator4.substract(minuend4, subtrahend4);

        int expected = 22;
        int expected3 = 61;
        int expected4 = 200;
        int actual1 = isCalculator1.getResult();
        int actual2 = isCalculator2.getResult();
        int actual3 = isCalculator3.getResult();
        int actual4 = isCalculator4.getResult();

        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);

        context.close();
    }

    @Test
    public void testDivide() {
        int dividend1 = 108;
        int divisor1 = 2;

        int dividend2 = 36;
        int divisor2 = 3;

        int dividend3 = 256;
        int divisor3 = 64;

        int dividend4 = 1500;
        int divisor4 = 50;

        isCalculator1.divide(dividend1, divisor1);
        isCalculator2.divide(dividend2, divisor2);
        isCalculator3.divide(dividend3, divisor3);
        isCalculator4.divide(dividend4, divisor4);

        int expected = 12;
        int expected3 = 4;
        int expected4 = 30;
        int actual1 = isCalculator1.getResult();
        int actual2 = isCalculator2.getResult();
        int actual3 = isCalculator3.getResult();
        int actual4 = isCalculator4.getResult();

        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);

        assertThrows(
                ZeroDivisionException.class,
                () -> isCalculator1.divide(1, 0),
                "zero division exception is not thrown");

        context.close();
    }

    @Test
    public void testMultiply() {
        int multiplier1 = 1;
        int multiplicand1 = 2;

        int multiplier2 = 20;
        int multiplicand2 = 10;

        int multiplier3 = 11;
        int multiplicand3 = 11;

        int multiplier4 = 34;
        int multiplicand4 = 100;

        isCalculator1.multiply(multiplier1, multiplicand1);
        isCalculator2.multiply(multiplier2, multiplicand2);
        isCalculator3.multiply(multiplier3, multiplicand3);
        isCalculator4.multiply(multiplier4, multiplicand4);

        int expected = 200;
        int expected3 = 121;
        int expected4 = 3400;
        int actual1 = isCalculator1.getResult();
        int actual2 = isCalculator2.getResult();
        int actual3 = isCalculator3.getResult();
        int actual4 = isCalculator4.getResult();

        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);

        context.close();
    }
}
