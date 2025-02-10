package Calculation;

public class Demo {
    public static void main(String[] args) {
        CalculateFunctionalInterface add = CalculateMethodReferance::sum;
        CalculateFunctionalInterface devise = CalculateMethodReferance::devise;
        CalculateFunctionalInterface substraction = CalculateMethodReferance::substraction;
        CalculateFunctionalInterface multiplication = CalculateMethodReferance::multiplication;
        try {
            System.out.println(devise.calculate(7, 3));
            System.out.println(add.calculate(7, 4));
            System.out.println(substraction.calculate(-9, 2));
            System.out.println(multiplication.calculate(7, 0));
            System.out.println(add.calculate(7, 0));
            System.out.println(devise.calculate(7, 0));
        } catch (NotValidValueException e) {
            System.out.println(e + " The NotValidValueException was catched");
        }
    }
}
