package calculator;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите поочередно два числа и знак операции (‘+’, ‘-’, ‘*’ или ‘/’): ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String calc = scanner.next();
        scanner.close();
        Calculator calculator = new Calculator(x, y, calc);
        System.out.println(calculator.Processing());
    }
}