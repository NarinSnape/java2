import java.util.Scanner;

public class TaskWork {
    /**
     * Выбор между программами калькулятора и поиска максимального слова в массиве.
     *
     * @author Anastasia G.
     * @version 1.0
     * @see #calculator()
     * @see #maxWord()
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите программу: \n1: калькулятор\n2: поиск максимального слова в массиве");
        int program = scanner.nextInt();
        if (program == 1) {
            calculator();
        } else if (program == 2) {
            maxWord();
        }
        scanner.close();
    }

    public static void calculator() {
        /**
         * калькулятор
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
        System.out.printf(x + calc + y + " = %.4f", result);
        scanner.close();
    }

    public static void maxWord() {
        /**
         * Поиск максимального слова в массиве.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int lengthArray = scanner.nextInt();
        int lengthWord = 0;
        int maxIndex = 0;
        String[] wordArray = new String[lengthArray];
        System.out.println("Введите слова поочередно, отправка каждого через Enter.");
        for(int i = 0; i < lengthArray; i++) {
            wordArray[i] = scanner.next();
            if(wordArray[i].length() > lengthWord) {
                lengthWord = wordArray[i].length();
                maxIndex = i;
            }
        }
        //Результат.
        System.out.println("Максимальное слово: " + wordArray[maxIndex]);
    }
}
