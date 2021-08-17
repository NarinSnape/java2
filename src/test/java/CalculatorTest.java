import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void checkDivisionToZeroIsInfinity() {
        Calculator calculator = new Calculator(Math.random(), 0, "/");
        Assert.assertEquals("При делении на 0 должно было быть Infinity.", Double.POSITIVE_INFINITY, calculator.Processing(), 0);
    }

    @Test
    public void checkMultiplication() {
        Calculator calculator = new Calculator(2, 2, "*");
        Assert.assertEquals("Дважды два четыре.", 4, calculator.Processing(), 0);
    }
    @Test
    public void checkDivision() {
        Calculator calculator = new Calculator(100, 3, "/");
        Assert.assertEquals("При делении 100 на 3 должно было выйти 33.333333333333336.", 33.333333333333336, calculator.Processing(), 0);
    }

    @Test
    public void checkSubtraction() {
        Calculator calculator = new Calculator(99, 99.1, "-");
        Assert.assertEquals("99 - 99.1 = -0.09999999999999432.", -0.09999999999999432, calculator.Processing(), 0);
    }

    @Test
    public void checkAddition() {
        Calculator calculator = new Calculator(99.99, 0.011, "+");
        Assert.assertEquals("99.99 + 0.011 = 100.00099999999999.", 100.00099999999999, calculator.Processing(), 0);
    }
//    @Test
//    public void checkWrongOperand() {
//        Calculator calculator = new Calculator(15, 10, "F");
//        Assert.assertEquals("Выбранной операции не существует.", "Я так не умею.", calculator.Processing());
//    }
}
