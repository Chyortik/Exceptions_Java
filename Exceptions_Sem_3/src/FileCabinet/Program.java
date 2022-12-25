package FileCabinet;

import FileCabinet.Bases.Classes.Presenter;
import FileCabinet.Bases.Classes.CheckInputData.*;
import FileCabinet.Bases.Classes.ParseData.CDataParseProcessor;
import FileCabinet.Bases.Classes.UI.CGetData;
import FileCabinet.Bases.Classes.WorkWithFile.CFileCreator;
import FileCabinet.Bases.Classes.WorkWithFile.CFileWriter;
import FileCabinet.Bases.Classes.WorkWithFile.CFindTheSameFileName;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src/FileCabinet/Data/";
        Presenter presenter = new Presenter(new CGetData(),
                new CDataParseProcessor(),
                new CCheckDataProcessor(new CCheckQuantity(),
                        new CCheckFullName(),
                        new CCheckBirthday(),
                        new CCheckSex()),
                new CFileWriter(new CFileCreator(),
                        new CFindTheSameFileName(),
                        infoPathFolder));
        presenter.run();
    }
}
