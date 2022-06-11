package com.hillel.hwYorsh15;

public enum Operation {

    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    String mathOperations;

    Operation(String mathOperations) {
        this.mathOperations = mathOperations;
    }

    public static Operation convert(String mathOperations) {
        for (Operation operation : values()) {
            if (operation.mathOperations.equals(mathOperations)) {
                return operation;
            }
        }
        return Operation.valueOf("NO");
    }
}
