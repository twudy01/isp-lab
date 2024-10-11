package isp.lab7.safehome;

public class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException(String message) {
        super("Too many attempts.");
    }
}
