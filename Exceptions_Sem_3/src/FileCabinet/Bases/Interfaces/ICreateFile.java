package FileCabinet.Bases.Interfaces;

import FileCabinet.Bases.Exceptions.FileCreateException;

import  java.io.IOException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}
