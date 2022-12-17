package Methods;

import java.util.Scanner;


class DivZero {
    // Метод принимает два целых числа
    // и возвращает результат деления
    // первого на второе
    static int divide(int x, int y) {
        int result = x / y;
        return result;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();

        try {
            System.out.println(divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("На " + num2 + " делить нельзя!");
        }
    }
}