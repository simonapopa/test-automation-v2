package UnitTests;

import OtherMethods.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testScadereFirst() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.scadere(4, 2));
    }
    @Test
    public void testScadereSecond(){
        Calculator calc = new Calculator();
        Assert.assertEquals(3, calc.scadere(4, 2));
    }

    @Test
    public void testInmultire() {
        Calculator calc = new Calculator();
        Assert.assertEquals(8, calc.inmultire(2, 4));
    }

    @Test
    public void testImpartire() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.impartire(12, 6), 0.0);
    }

    @Test
    public void testGetNumbersProduct() {
        Calculator calc = new Calculator();
        Assert.assertEquals(15, calc.getNumbersProduct(5, 3), 0.0);
    }

    @Test
    public void testGetNumbersProd() {
        Calculator calc = new Calculator();
        Assert.assertEquals(10, calc.getNumbers(10, 10, 10), 0.0);
    }

    @Test
    public void testGetYourName() {
        Calculator calc = new Calculator();
        Assert.assertEquals("simona", calc.getYourName("simona"));
    }

    @Test
    public void testFahrenheit() {
        Calculator calc = new Calculator();
        Assert.assertEquals(10.0, calc.nineExercise(50), 0.0);
    }

    @Test
    public void testTenthExercise() {
        Calculator calc = new Calculator();
        Assert.assertEquals(1.27, calc.tenthExercise(50), 0.0);
    }

    @Test
    public void testEleventhExercise() {
        Calculator calc = new Calculator();
        Assert.assertEquals(7385.0, calc.eleventhExercise(2, 3, 5), 0.0);
        //Assert.assertNotEquals(7385.0, calc.eleventhExercise(2, 3, 5), 0.0);
    }


}
