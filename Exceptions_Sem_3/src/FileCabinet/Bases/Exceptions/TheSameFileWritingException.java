package FileCabinet.Bases.Exceptions;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message) {
        super("Файл не найден" + message);
    }
}
