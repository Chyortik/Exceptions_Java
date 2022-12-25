package FileCabinet.Bases.Interfaces;

import FileCabinet.Bases.Exceptions.MyFileCreateException;
import FileCabinet.Bases.Exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;

}
