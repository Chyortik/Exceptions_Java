package FileCabinet.Bases.Exceptions;

public class CheckQuantityException extends RuntimeException {
    public CheckQuantityException() {
        super("Неверное количество элементов во введенных данных!");
    }
}
