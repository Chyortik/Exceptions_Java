package FileCabinet.Bases.Exceptions;

import java.io.IOException;

public class GetDataException extends IOException {
    public GetDataException(IOException message){
        super("Ошибка при чтении из консоли" + message.getMessage());
    }
}
