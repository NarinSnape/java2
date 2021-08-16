package calculator;

public class Calculator {
    // метод конструктора, параметрами которому передавать числа, символ (или код операции)
    private final double x;
    private final double y;
    private final String calc;

    public Calculator(double x, double y, String calc) {
        this.x = x;
        this.y = y;
        this.calc = calc;
    }

    public void Processing() {
        double result;
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
    private double Addition(double x, double y) {
        return x + y;
    }

    private double Division(double x, double y) {
        return x / y;
    }

    private double Multiplication(double x, double y) {
        return x * y;
    }

    private double Subtraction(double x, double y) {
        return x - y;
    }
}
