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

    public String Processing() throws DoubleArithmeticException {
        double result = 0;
        switch (calc) {
            case "+":
                result = Addition(x, y);
                break;
            case "-":
                result = Subtraction(x, y);
                break;
            case "*":
                result = Multiplication(x, y);
                break;
            case "/": {
                if(y == 0) {
                    throw new DoubleArithmeticException("На 0 делить нельзя.");
                }
                else {
                    result = Division(x, y);
                }
                break;
            }
            default:
                return "Я так не умею.";
        }
        return "Результат: " + result;
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
