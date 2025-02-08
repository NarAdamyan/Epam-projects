package Calculation;

public class CalculateMethodReferance {
    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int substraction(int a, int b){
        return a - b;
    }

    public static int sum(int a, int b) throws NotValidValueException{
        if (b == 0) {
            throw new NotValidValueException("Not allowed value 0");
        }
        return a + b;
    }

    public static int devise(int a, int b) throws NotValidValueException{
        if (b == 0) {
            throw new NotValidValueException("Cannot divide by 0");
        }
        return a / b;
    }
}
