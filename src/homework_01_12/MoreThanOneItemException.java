package homework_01_12;

public class MoreThanOneItemException extends Exception {
    public MoreThanOneItemException() {
        super("More than one gift selected! Please remove one.");
    }
}
