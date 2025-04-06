package dev.patika.definexjavaspringbootbootcamp2025.hw2;

/**
 * interface'i IntegerScientificCalculator olarak adlandirmamin sebebi: https://en.wikipedia.org/wiki/Subtraction
 */
public interface IntegerScientificCalculator {

    void add(int augend, int addend);
    void substract(int minuend, int subtrahend);
    void divide(int dividend, int divisor) throws ZeroDivisionException;
    void multiply(int multiplier, int multiplicand);
    int getResult();
}
