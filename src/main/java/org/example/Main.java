package org.example;

public class Main {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(
//                calc.newFormula()
//                        .addOperand(5)
//                        .addOperand(15)
//                        .calculate(Calculator.Operation.MULT)
//                        .result()
//        );

//        Ints intsCalc = new IntsCalculator();
//        System.out.println(intsCalc.sum(2, 2));
//        System.out.println(intsCalc.sum(10, 22));
//        System.out.println(intsCalc.pow(2, 10));

        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(5, 3));
        System.out.println(calc.mult(5, 3));
        System.out.println(calc.pow(5, 3));

    }
}