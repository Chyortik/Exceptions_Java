package FileCabinet.Bases.Exceptions;

public class FullNameReadFromDataException extends IndexOutOfBoundsException {
    public FullNameReadFromDataException(String s){
        super("Ошибка чтения при вводе ФИО" + s);
    }
}
