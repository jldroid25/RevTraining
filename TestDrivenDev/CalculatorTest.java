import static org.junit.jupitor.api.Assertions.*;

//Try coding this on Eclipse instead
public class CalculatorTest {

    //We are working with JUnit 5 (it has Jupitor on it , JUnit-4 doesn't)
    @Test 
    void testForAddition(){
        Calculator calc = new Calculator();
        int actualOutout = calc.add(5, 4);
        int expectedOutput = 9;
        AsserEquals(expectedOutput, actualOutout);

    }

    
}