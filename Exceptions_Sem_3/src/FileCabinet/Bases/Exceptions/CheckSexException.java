package FileCabinet.Bases.Exceptions;

public class CheckSexException extends RuntimeException {
    public CheckSexException() {
        super("Значение пола пусто!");
    }
}
