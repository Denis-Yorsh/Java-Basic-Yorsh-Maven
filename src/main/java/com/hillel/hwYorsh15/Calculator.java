package com.hillel.hwYorsh15;

public class Calculator {

    public Double calculate(double a, String operation, double b) {
        Operation mathOperation = Operation.convert(operation);
        if ((a == 0 || b == 0) && operation.equals("/")){
            return -1.0;
        } else {
            switch (mathOperation) {
                case PLUS:
                    return a + b;
                case MINUS:
                    return a - b;
                case MULTIPLY:
                    return a * b;
                case DIVIDE:
                    return a / b;
            }
        }
        return -1.0;
    }
}
