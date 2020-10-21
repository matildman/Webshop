package hu.training360.horvathaj.Webshop;

public class InvalidWebshopOperations extends RuntimeException {

    private Exceptions errorCode;

    public InvalidWebshopOperations(Exceptions errorCode) {
        this.errorCode = errorCode;
    }

    public InvalidWebshopOperations(String message, Exceptions errorCode) {
        super(message);
        this.errorCode = errorCode;

    }

    public Exceptions getErrorCode() {
        return this.errorCode;
    }

}
