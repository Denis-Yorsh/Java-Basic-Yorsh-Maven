package com.hillel.hwYorsh16;

public enum Operations {

    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");


    String mathOperation;

    Operations(String mathOperations) {
        this.mathOperation = mathOperations;
    }

    public static Operations convert(String mathOperation) {
           for (Operations operation : values()) {
               if (operation.mathOperation.equals(mathOperation)) {
                   return operation;
               }
           }
        return null;
    }
}
