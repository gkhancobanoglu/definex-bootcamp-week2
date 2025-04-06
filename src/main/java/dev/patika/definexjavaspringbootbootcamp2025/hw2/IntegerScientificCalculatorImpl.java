package dev.patika.definexjavaspringbootbootcamp2025.hw2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class IntegerScientificCalculatorImpl implements IntegerScientificCalculator {

    private int result;
    @Override
    public void add(int augend, int addend) {
        result =  augend + addend;
    }

    @Override
    public void substract(int minuend, int subtrahend) {
        result = minuend - subtrahend;
    }

    @Override
    public void divide(int dividend, int divisor) throws ZeroDivisionException {
        if (divisor == 0) {
            throw new ZeroDivisionException();
        }
        result = dividend / divisor;
    }

    @Override
    public void multiply(int multiplier, int multiplicand) {
        result = multiplier * multiplicand;
    }

    @Override
    public int getResult() {
        return result;
    }
}
