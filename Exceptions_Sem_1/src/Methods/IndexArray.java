package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class IndexArray {
    public static void main(String args[]) {
        int[] myArray = {897, 56, 78, 90, 12, 123, 75};
        System.out.println("Элементы массива: ");
        System.out.println(Arrays.toString(myArray));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс нужного элемента массива: ");
        boolean run = true;
        while (run) {
            try {
                int element = sc.nextInt();
                System.out.println("Элемент массива по введенному индексу: " + myArray[element]);
                run = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Введенный индекс не найден,\n введите цифру от 0 and 6");
            }
        }
    }
}