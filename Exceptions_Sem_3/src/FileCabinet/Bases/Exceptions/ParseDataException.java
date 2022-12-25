package FileCabinet.Bases.Exceptions;

public class ParseDataException extends RuntimeException {
    public ParseDataException(String message) {
        super("Ошибка при парсинге данных " + message);
    }
}
