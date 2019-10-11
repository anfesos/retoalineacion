package co.com.accenture.vivacolombia.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class AbrirUrlException extends SerenityManagedException {

    public static final String NO_PUDO_ABRIR_URL ="No abrio la página";

    public AbrirUrlException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
