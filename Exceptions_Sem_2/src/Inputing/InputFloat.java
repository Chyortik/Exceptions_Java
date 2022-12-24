package Inputing;

import java.util.Scanner;
public class InputFloat {
    public static Float userInput(){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        Float i = null;
        while (run) {
            System.out.print("Введите число: ");
            String inputText = sc.nextLine();

            try {
                i = Float.parseFloat(inputText);
                run = false;
            }catch (NumberFormatException e){
                System.out.println("Ошибка: вводите только числа"); // (" + e.getLocalizedMessage() + ")");
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Float a = userInput();
        System.out.println("Результат: " + a);
    }
}