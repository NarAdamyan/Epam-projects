package Calculation;

public class NotValidValueException extends Exception {
    public NotValidValueException(String message) {

        super("An invalid value was provided");
    }
}
