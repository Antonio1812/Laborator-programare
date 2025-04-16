import org.junit.jupiter.api.*;

public class GroupTest {
    private ACalculator calculator;
    private NewIntCalculator newIntCalculator;
    private DoubleCalculator doubleCalculator;

    @BeforeEach
    public void setup(){
        calculator=new ACalculator(10);
        newIntCalculator=new NewIntCalculator(10);
        doubleCalculator=new DoubleCalculator(10);
    }

    @Test
    public void testAdd() {
        NewIntCalculator newIntCalculator=new NewIntCalculator(10);
        DoubleCalculator doubleCalculator=new DoubleCalculator(10);

        newIntCalculator.add(5);
        doubleCalculator.add(3.3);

        Assertions.assertTrue(newIntCalculator.result()==15);
        Assertions.assertTrue(doubleCalculator.resultDouble()==13.3);
    }

    @Test
    public void testMultiplyDivideWith0() {
        NewIntCalculator newIntCalculator = new NewIntCalculator(10);
        DoubleCalculator doubleCalculator = new DoubleCalculator(10);

        //Assertions.assertTrue(newIntCalculator.divide(0).result()==Double.POSITIVE_INFINITY);
        Assertions.assertTrue(doubleCalculator.divide(0).resultDouble()==Double.POSITIVE_INFINITY);
    }


    @AfterEach
    public void teardown(){
        newIntCalculator=null;
        doubleCalculator=null;
    }
}
