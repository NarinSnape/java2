package calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите поочередно два числа и знак операции (‘+’, ‘-’, ‘*’ или ‘/’): ");
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0;
        String calc = "";
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        calc = scanner.next();
        scanner.close();
        try {
            Calculator calculator = new Calculator(x, y, calc);
            calculator.Processing();
        } catch (DoubleArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

    }
}