package Methods;

import java.util.Scanner;

public class SampleInput {
    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        Integer i = null;
        while (run) {
            System.out.print("Введите число: ");
            String inputText = sc.nextLine();
            if (inputText.equals("exit"))
                System.exit(-1);
            try {
                i = Integer.parseInt(inputText);
                run = false;
            }catch (NumberFormatException e){
                System.out.println("Ошибка: вводите только целые числа (" + e.getLocalizedMessage() + ")");
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int a = userInput();
        int b = userInput();
        int result = a + b;
        System.out.println("Итого: " + result);
    }
}