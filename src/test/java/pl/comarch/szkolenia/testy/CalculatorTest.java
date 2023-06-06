package pl.comarch.szkolenia.testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Konstruktor klasy testujacej !!!");
    }

    @Test
    public void addTwoPositivesTest() {
        int a = 5;
        int b = 7;
        int expected = 12;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addPositiveAndNegativeTest() {
        int a = -5;
        int b = 7;
        int expected = 2;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideTwoPositivesTest() {
        int a = 10;
        int b = 5;
        double expected = 2.0;

        double actual = calculator.divide(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideWithDecimalResultTest() {
        int a = 5;
        int b = 2;
        double expected = 2.5;

        double actual = calculator.divide(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(a,b));
    }
}
