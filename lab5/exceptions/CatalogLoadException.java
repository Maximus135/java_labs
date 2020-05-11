package lab5.exceptions;

public class CatalogLoadException extends Exception {
    private static final long serialVersionUID = 1L; // проблема сериализации

    public CatalogLoadException(ItemAlreadyExistsException e) {
        super(e);
    }

    public CatalogLoadException(String string) {
    }

}