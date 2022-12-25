package FileCabinet.Bases.AbstractClasses;


import FileCabinet.Bases.Interfaces.ICheckBirthday;
import FileCabinet.Bases.Interfaces.ICheckFullName;
import FileCabinet.Bases.Interfaces.ICheckQuantity;
import FileCabinet.Bases.Interfaces.ICheckSex;
public abstract class ACheckDataProcessor implements ICheckFullName, ICheckQuantity, ICheckBirthday, ICheckSex{
    protected ACheckQuantity checkQuantity;
    protected ACheckFullName checkFullName;
    protected ACheckData checkBirthday;
    protected ACheckData checkSex;

    public ACheckDataProcessor(ACheckQuantity checkQuantity,
                               ACheckFullName checkFullName,
                               ACheckData checkBirthday,
                               ACheckData checkSex) {
        this.checkQuantity = checkQuantity;
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
    }
}
