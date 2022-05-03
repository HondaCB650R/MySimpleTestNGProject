import org.testng.Assert;
import org.testng.annotations.Test;


public class MyCalculatorTest {

    @Test
    void testAddMethod(){

        int firstValue = 20, secondValue = 60;
        int expectedResult = firstValue + secondValue;
        int actualResult = MyCalculator.add(firstValue, secondValue);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testMultiplyMethod(){

        int firstOperand = 10, secondOperand = 5;
        int expectedResult = firstOperand * secondOperand;
        int actualResult = MyCalculator.multiply(firstOperand, secondOperand);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    void testDivideMethod(){

        int firstOperand = 40, secondOperand = 20;
        int expectedResult = firstOperand / secondOperand;
        int actualResult = MyCalculator.divide(firstOperand, secondOperand);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    void testSubtractMethod(){

        int firstOperand = 50, secondOperand = 10;
        int expectedResult = firstOperand - secondOperand;
        int actualResult = MyCalculator.subtract(firstOperand, secondOperand);

        Assert.assertEquals(actualResult,expectedResult);
    }


    }
