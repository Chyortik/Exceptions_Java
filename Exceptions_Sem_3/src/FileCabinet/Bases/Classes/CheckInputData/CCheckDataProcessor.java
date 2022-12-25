package FileCabinet.Bases.Classes.CheckInputData;

import FileCabinet.Bases.AbstractClasses.ACheckData;
import FileCabinet.Bases.AbstractClasses.ACheckDataProcessor;
import FileCabinet.Bases.AbstractClasses.ACheckFullName;
import FileCabinet.Bases.AbstractClasses.ACheckQuantity;

public class CCheckDataProcessor extends ACheckDataProcessor {
    public CCheckDataProcessor(ACheckQuantity checkQuantity,
                               ACheckFullName checkFullName,
                               ACheckData checkBirthday,
                               ACheckData checkSex) {

        super(checkQuantity, checkFullName, checkBirthday, checkSex);

    }

    @Override
    public boolean checkBirthday(String birthday){
        super.checkBirthday.checkElement(birthday);
        System.out.println("Формат даты рождения - ОК");
        return true;
    }

    @Override
    public boolean checkFullName(String[] fullName) {
        super.checkFullName.checkFullName(fullName);
        System.out.println("Формат ввода имени - ОК");
        return true;
    }

    @Override
    public boolean checkQuantity(String[] data){
        super.checkQuantity.checkQuantity(data);
        System.out.println("Формат чисел дня рождения - ОК");
        return true;
    }

    @Override
    public boolean checkSex(String sex) {
        super.checkSex.checkElement(sex);
        System.out.println("Формат ввода пола - ОК");
        return true;
    }

}
