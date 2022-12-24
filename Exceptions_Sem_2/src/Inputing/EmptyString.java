package Inputing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmptyString {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        try {
            String result = reader.readLine();
            if(result.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");

            System.out.println("Результат ввода\n" + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}