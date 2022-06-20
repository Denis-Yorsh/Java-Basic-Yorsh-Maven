package com.hillel.hwYorsh16;

public class CalculatorStart {

    public static void main(String[] args) {

        var numberMultiply = Calculators.calculate(22, "*", 2);
        System.out.println("Multiply: " + numberMultiply);
        System.out.println();
        var divideIsZero = Calculators.calculate(22, "/", 0);
        System.out.println(divideIsZero);
        System.out.println();
        var divideIsZero1 = Calculators.calculate(22, "%", 2);
        System.out.println(divideIsZero1);
        System.out.println();
        var numberPlus = Calculators.calculate(12, "+", 2);
        System.out.println("Plus: " + numberPlus);
        System.out.println();
        var numberNull = Calculators.calculate(22, null, 2);
        System.out.println(numberNull);
        System.out.println();
        var string = Calculators.calculate("w", "/", "2");
        System.out.println(string);
        System.out.println();
        var stringResult = Calculators.calculate("5", "/", "2");
        System.out.println("String Calculators: " + stringResult);
        System.out.println("\nFINISH");
    }
}
