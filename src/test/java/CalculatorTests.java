import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.distansakademin.Calculator;

public class CalculatorTests {

    @Test
    void testAdd(){ // AAA
        // Arrange -> förberedelser och setup
        // vilka nummer ska adderas? vad förväntar vi oss för resultat?
        int a = 5;
        int b = 10;
        int expected = 15;

        // Act -> genomför test och hämta resultat
        // lägg ihop talen och spara summan
        int result = Calculator.add(a, b);

        // Assert -> kontrollera att resultatet är det vi förväntar oss
        // assert expected == result;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testMultiply(){
        // Arrange
        int a = 5;
        int b = 10;
        int expected = 50;

        // Act
        int result = Calculator.multiply(a, b);

        // Assert
        // assert expected == result;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testSubtract(){
        // Arrange
        int a = 5;
        int b = 10;
        int expected = -5;

        // Act
        int result = Calculator.subtract(a, b);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testDivide(){
        // Arrange
        float a = 5f;
        float b = 10f;
        float expected = 0.5f;

        // Act
        float result = Calculator.divide(a,b);

        // Assert
        Assertions.assertEquals(expected, result);
    }
}
