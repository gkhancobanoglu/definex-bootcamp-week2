package dev.patika.definexjavaspringbootbootcamp2025.hw2;

public class ZeroDivisionException extends RuntimeException {
    public ZeroDivisionException() {
        super("cannot divide by zero");
    }
}
