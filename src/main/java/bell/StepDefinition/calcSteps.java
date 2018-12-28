package bell.StepDefinition;

import bell.calc.Calculator;
import cucumber.api.PendingException;
import cucumber.api.java.ru.*;
import org.junit.Assert;

public class calcSteps {
    private Calculator calculator = new Calculator();

    private double firstNumber;
    private double secondNumber;
    private double sum;

    @Дано("^два числа: (-?\\d+,?\\d*) и ([-]?\\d+,?\\d*)$")
    public void fillNumbers(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Когда("^мы вычисляем сумму двух чисел$")
    public void calculateSum() {
        this.sum = calculator.sum(firstNumber, secondNumber);
    }

    @Тогда("^результат равен: (-?\\d+,?\\d*)$")
    public void результатРавен(double asserted) {
        Assert.assertEquals(asserted, this.sum, 0.0001);
    }

}