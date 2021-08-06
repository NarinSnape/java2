package calculator;

public class Calculator {
    // метод конструктора, параметрами которому передавать числа, символ (или код операции)
    private double x;
    private double y;
    private String calc;

    public Calculator(double x, double y, String calc) {
        this.x = x;
        this.y = y;
        this.calc = calc;
    }

    public String Processing() {
        double result = 0;
        switch (calc) {
            case "+":
                result = Addition(x, y);
                break;
            case "-":
                result = Substraction(x, y);
                break;
            case "*":
                result = Multiplication(x, y);
                break;
            case "/":
                if (y != 0) {
                    result = Division(x, y);
                } else {
                    return "На 0 делить нельзя.";
                }
                break;
            default:
                return "А так я не умею.";
        }
            return  "Результат: " + result;
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
    private double Substraction(double x, double y) {
        return x - y;
    }
}
