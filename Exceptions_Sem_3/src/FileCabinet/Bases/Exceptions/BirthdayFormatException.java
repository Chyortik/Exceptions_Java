package FileCabinet.Bases.Exceptions;

public class BirthdayFormatException extends RuntimeException {
    public BirthdayFormatException(){
        super("Неверный формат дня рождения!!!");
    }
}
