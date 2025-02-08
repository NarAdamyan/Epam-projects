package Calculation;

public class Demo {
    public static void main(String[] args) {
        CalculateFunctionalInterface calculate;
        calculate = CalculateMethodReferance::sum;
        try {
            System.out.println(calculate.calculate(7, 0));
        } catch (NotValidValueException e) {
            System.out.println(e + " Catched NotValidValueException");
        }
        calculate = CalculateMethodReferance::devise;
        try {
            System.out.println(calculate.calculate(10, 2));
            System.out.println(calculate.calculate(10, 0));
        } catch (NotValidValueException e) {
            System.out.println(e + " Catched exception");
        }
        calculate = CalculateMethodReferance::multiplication;
        try {
            System.out.println(calculate.calculate(10, 10)); // Works fine
        } catch (NotValidValueException e) {
            System.out.println("unexpected");
        }
        calculate = CalculateMethodReferance::substraction;
        try {
            System.out.println(calculate.calculate(10, 6)); // Works fine
        } catch (NotValidValueException e) {
            System.out.println("unexpected");
        }
    }
}
