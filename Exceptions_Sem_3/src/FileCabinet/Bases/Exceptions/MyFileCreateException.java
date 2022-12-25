package FileCabinet.Bases.Exceptions;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("Не могу создать файл: " + message);
    }
}
