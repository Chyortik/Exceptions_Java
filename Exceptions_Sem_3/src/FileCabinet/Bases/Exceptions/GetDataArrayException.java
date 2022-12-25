package FileCabinet.Bases.Exceptions;

public class GetDataArrayException extends RuntimeException {
    public GetDataArrayException(){
        super("Массив данных пуст. Перед получением данных нужно запустить метод parseData");
    }
}
