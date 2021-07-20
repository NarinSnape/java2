import java.util.Scanner;

public class TaskWork2 {
    public static void main(String[] args) {
        /**
         * 2 задание: калькулятор
         * @author Anastasia G.
         * @version 1.0
         */
        //Пользователь вводит поочередно два дробных числа.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите поочередно два дробных числа и знак операции (‘+’, ‘-’, ‘*’ или ‘/’): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double result = 0;
        String calc = scanner.next();
        //*Выбор вида операции.
        switch (calc) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("На 0 делить нельзя.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Что-то пошло не так.");
                break;
        }
        //Результат операции.
        System.out.printf(x + calc + y + " = %.2f", result);
    }
}
