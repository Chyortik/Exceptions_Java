package FileCabinet.Bases.AbstractClasses;

import FileCabinet.Bases.Classes.WorkWithFile.CFileCreator;
import FileCabinet.Bases.Classes.WorkWithFile.CFindTheSameFileName;
import FileCabinet.Bases.Interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile{
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
