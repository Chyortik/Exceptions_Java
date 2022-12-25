package FileCabinet.Bases.Classes.CheckInputData;

import FileCabinet.Bases.AbstractClasses.ACheckData;
import FileCabinet.Bases.Exceptions.CheckSexException;
import FileCabinet.Bases.Exceptions.IncorrectSexValuesException;

public class CCheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data){
        if (data.equals(""))
            throw new CheckSexException();
        if (!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
        return true;
    }
}
