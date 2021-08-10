package calculator;

public class Calculator {
    // метод конструктора, параметрами которому передавать числа, символ (или код операции)
    private final int x;
    private final int y;
    private final String calc;

    public Calculator(int x, int y, String calc) {
        this.x = x;
        this.y = y;
        this.calc = calc;
    }

    public void Processing() {
        int result;
        switch (calc) {
            case "+":
                result = Addition(x, y);
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = Subtraction(x, y);
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = Multiplication(x, y);
                System.out.println("Результат: " + result);
                break;
            case "/": {
                try {
                    result = Division(x, y);
                    System.out.println("Результат: " + result);

                } catch (ArithmeticException e) {
                    System.out.println("На 0 делить нельзя.");
                }
                break;
            }
            default:
                System.out.println("Я так не умею.");
        }
    }

    //методы вычисления результата
    private int Addition(int x, int y) {
        return x + y;
    }

    private int Division(int x, int y) {
        return x / y;
    }

    private int Multiplication(int x, int y) {
        return x * y;
    }

    private int Subtraction(int x, int y) {
        return x - y;
    }
}
