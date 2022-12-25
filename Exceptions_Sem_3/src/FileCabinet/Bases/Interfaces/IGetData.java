package FileCabinet.Bases.Interfaces;
import FileCabinet.Bases.Exceptions.GetDataException;
import java.io.IOException;

public interface IGetData {
    public String getData() throws IOException;

}
