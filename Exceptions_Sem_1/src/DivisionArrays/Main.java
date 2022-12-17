package DivisionArrays;
import java.util.ArrayList;
import java.util.List;

class DivideArrays {
    public static void main(String args[]) {

        int array1[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int array2[] = { 1, 0, 2, 4, 16, 4, 16, 32 };
        List<Integer> array3 = new ArrayList<>();
        for(int i=0; i<array1.length; i++) {
            try {
                array3.add(array1[i] / array2[i]);
            } catch (Exception exc) {
                System.out.println("На ноль делить нельзя. Для устранения проблемы вводите в массив " +
                        " элементы, не равные нулю");
            }
        }
        System.out.println("Итоговый массив после разности элементов " +
                "исходных массивов - " + array3);
    }
}