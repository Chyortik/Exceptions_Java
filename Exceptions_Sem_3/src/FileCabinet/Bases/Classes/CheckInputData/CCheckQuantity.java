package FileCabinet.Bases.Classes.CheckInputData;

import FileCabinet.Bases.AbstractClasses.ACheckQuantity;
import  FileCabinet.Bases.Exceptions.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]){
        if (data.length != 6)
            throw new CheckQuantityException();
        return true;
    }
}
