package FileCabinet.Bases.Exceptions;

import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message) {
        super("Файл не создан" + message);
    }
}
