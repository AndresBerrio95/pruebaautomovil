package prueba.movil.exceptions;

public class NoExisteOperadorException extends RuntimeException {
    public NoExisteOperadorException(String operador) {
        super("El operador " + operador + " escogido, no existe ");
    }
}