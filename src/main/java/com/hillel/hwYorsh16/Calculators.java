package com.hillel.hwYorsh16;

public class Calculators {

    public static Double calculate(double a, String operation, double b)
            throws NullPointerException, ArithmeticException {

        Operations mathOperation = Operations.convert(operation);
        var result = -1.;
        try {
            switch (mathOperation) {
                case PLUS:
                    result = a + b;
                    break;
                case MINUS:
                    result = a - b;
                    break;
                case MULTIPLY:
                    result = a * b;
                    break;
                case DIVIDE:
                    result = a / b;
                    break;
            }
            if (Double.isInfinite(result)) {
                throw (new ArithmeticException("INFINITE"));
            }
        } catch (NullPointerException e) {
            System.out.println("NPE " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        }
        return result;
    }

    public static String calculate(String a, String operation, String b)
            throws NullPointerException, ArithmeticException, CalculatorException {

        try {
            if (a.matches("[a-zA-Z]") || b.matches("[a-zA-Z]")) {
                throw new CalculatorException("ERROR");
            }
            Operations mathOperation = Operations.convert(operation);
            Double stringOne = Double.valueOf(a);
            Double stringTwo = Double.valueOf(b);
            return getResultDouble(stringOne, stringTwo, mathOperation);

        } catch (NullPointerException e) {
            System.out.println("NPE " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + e.getMessage());
        } catch (CalculatorException e) {
            System.err.println("Calculator Exception " + e.getMessage());
        }
        return String.valueOf(-1);
    }

    private static String getResultDouble(Double stringOne, Double stringTwo, Operations mathOperation) {
        var resultDouble = 0.;
        switch (mathOperation) {
            case PLUS:
                resultDouble = stringOne + stringTwo;
                break;
            case MINUS:
                resultDouble = stringOne - stringTwo;
                break;
            case MULTIPLY:
                resultDouble = stringOne * stringTwo;
                break;
            case DIVIDE:
                resultDouble = stringOne / stringTwo;
                break;
        }
        return String.valueOf(resultDouble);
    }
}
