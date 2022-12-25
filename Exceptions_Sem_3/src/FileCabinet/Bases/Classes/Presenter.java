package FileCabinet.Bases.Classes;

import FileCabinet.Bases.AbstractClasses.ACheckDataProcessor;
import FileCabinet.Bases.AbstractClasses.AFileWriter;
import FileCabinet.Bases.AbstractClasses.APresenter;
import FileCabinet.Bases.Classes.ParseData.CDataParseProcessor;
import FileCabinet.Bases.Classes.UI.CGetData;
import FileCabinet.Bases.Classes.WorkWithFile.CFindTheSameFileName;

import java.io.IOException;

public class Presenter extends APresenter {
    private final CGetData getData;
    private final CDataParseProcessor dataParseProcessor;
    private final ACheckDataProcessor dataProcessor;
    private final AFileWriter fileWriter;

    /**
     * Объединяет в работу пользовательский интерфейс, парсер строки, проверку на валидность элементов строки
     * Пишет в файлы инфо по заданному формату.
     * @param getData - пользовательский интерфейс.
     * @param dataParseProcessor - парсер строки.
     * @param dataProcessor - проверка элементов на валидность
     * @param fileWriter - пишет в файл согласно условию.
     */
    public Presenter(CGetData getData,
                     CDataParseProcessor dataParseProcessor,
                     ACheckDataProcessor dataProcessor,
                     AFileWriter fileWriter
                     ) {
        this.getData = getData;
        this.dataParseProcessor = dataParseProcessor;
        this.dataProcessor = dataProcessor;
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() throws IOException {
        dataParseProcessor.parseData(getData.getData());
        // проверка ввода всех данных
        dataProcessor.checkQuantity(dataParseProcessor.getDataArray());
        // проверка ввода ФИО
        dataProcessor.checkFullName(dataParseProcessor.getFullName());
        // проверка ввода даты рождения
        dataProcessor.checkBirthday(dataParseProcessor.getBirthday());
        // проверка ввода пола
        dataProcessor.checkSex(dataParseProcessor.getSex());
        System.out.println("\n Все данные введены верно");
        // запись введенных данных в файл
        fileWriter.writeToFile(dataParseProcessor.getInfoToWrite());
    }

}
