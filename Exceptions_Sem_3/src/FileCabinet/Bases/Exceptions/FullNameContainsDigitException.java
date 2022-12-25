package FileCabinet.Bases.Exceptions;

public class FullNameContainsDigitException extends RuntimeException {
    public FullNameContainsDigitException() {
        super("Один или несколько символов в значении полного имени являются цифрами!");
    }
}
