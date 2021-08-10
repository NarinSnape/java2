package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите поочередно два целых числа и знак операции (‘+’, ‘-’, ‘*’ или ‘/’): ");
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        String calc = "";
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            calc = scanner.next();
        } catch (InputMismatchException ime) {
            System.out.println("Неверные данные, попробуйте снова.");
        }

        scanner.close();
        Calculator calculator = new Calculator(x, y, calc);
        calculator.Processing();
    }
}