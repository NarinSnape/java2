package calculator;

import calculator.operations.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите поочередно два числа и знак операции (‘+’, ‘-’, ‘*’ или ‘/’): ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String calc = scanner.next();
        scanner.close();
        System.out.println(Processing(x, y, calc));
    }

    private static String Processing(double x, double y, String calc) {
        double result = 0;
        switch (calc) {
            case "+":
                Operation operation = new Addition();
                result = operation.Calculate(x, y);
                break;
            case "-":
                operation = new Substraction();
                result = operation.Calculate(x, y);
                break;
            case "*":
                operation = new Multiplication();
                result = operation.Calculate(x, y);
                break;
            case "/":
                if (y != 0) {
                    operation = new Division();
                    result = operation.Calculate(x, y);
                } else {
                    System.out.println("На 0 делить нельзя.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Что-то пошло не так.");
                break;
        }
        return "Результат: " + result;
    }
}