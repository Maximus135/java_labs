package lab5.exceptions;

public class ItemAlreadyExistsException extends Exception {
    private static final long serialVersionUID = 1L;

    public ItemAlreadyExistsException(String e) {
        super(e);
    }
}