import calculator.Calculator;
import calculator.DoubleArithmeticException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test(expected = DoubleArithmeticException.class)
    public void checkDivisionToZeroIsInfinity() throws DoubleArithmeticException {
        Calculator calculator = new Calculator(Math.random(), 0, "/");
        Assert.assertEquals("Проверка деления на ноль.", calculator.Processing());
    }

    @Test
    public void checkMultiplication() throws DoubleArithmeticException {
        Calculator calculator = new Calculator(2, 2, "*");
        Assert.assertEquals("Дважды два четыре.", "Результат: 4.0", calculator.Processing());
    }

    @Test
    public void checkDivision() throws DoubleArithmeticException {
        Calculator calculator = new Calculator(100, 3, "/");
        Assert.assertEquals("При делении 100 на 3 должно было выйти 33.333333333333336.", "Результат: 33.333333333333336", calculator.Processing());
    }

    @Test
    public void checkSubtraction() throws DoubleArithmeticException {
        Calculator calculator = new Calculator(99, 99.1, "-");
        Assert.assertEquals("99 - 99.1 = -0.09999999999999432.", "Результат: -0.09999999999999432", calculator.Processing());
    }

    @Test
    public void checkAddition() throws DoubleArithmeticException {
        Calculator calculator = new Calculator(99.99, 0.011, "+");
        Assert.assertEquals("99.99 + 0.011 = 100.00099999999999.", "Результат: 100.00099999999999", calculator.Processing());
    }

    @Test
    public void checkWrongOperand() throws DoubleArithmeticException {
        Calculator calculator = new Calculator(15, 10, "F");
        Assert.assertEquals("Выбранной операции не существует.", "Я так не умею.", calculator.Processing());
    }
}
