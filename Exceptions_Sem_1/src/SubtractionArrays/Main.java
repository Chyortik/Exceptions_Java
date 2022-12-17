package SubtractionArrays;

import java.util.ArrayList;
import java.util.List;

class SubtractArrays {
    public static void main(String args[]) {

        int array1[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int array2[] = { 2, 0, 4, 4, 0, 8 };
        List<Integer> array3 = new ArrayList<>();
        for(int i=0; i<array1.length; i++) {
            try {
                array3.add(array1[i] - array2[i]);
            } catch (Exception exc) {
                System.out.println("Массивы разной длины. Для устранения проблемы объявите массивы" +
                        "одинаковой длины");
                break;
            }
        }
        System.out.println("Итоговый массив после разности элементов" +
                "исходных массивов" + array3);
    }
}