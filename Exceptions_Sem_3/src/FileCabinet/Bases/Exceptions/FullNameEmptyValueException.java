package FileCabinet.Bases.Exceptions;

public class FullNameEmptyValueException extends RuntimeException {
    public FullNameEmptyValueException(){
        super("Одно или несколько значений в ФИО пусты");
    }
}
