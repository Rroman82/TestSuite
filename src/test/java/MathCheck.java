import org.testng.Assert;
import org.testng.annotations.Test;

public class MathCheck extends  TestInit {

    MathActions mathActions = new MathActions();

    @Test
    public void checkSumm(){

            Assert.assertTrue(mathActions.summ( 2, 2) == 4);
            Assert.assertTrue(mathActions.summ(2, 5) == 7);
            Assert.assertTrue(mathActions.summ(5, 5) == 10);

        }
        @Test
            public void checkMultiply() {
     Assert.assertTrue(mathActions.multiply(  2,  2)==4);
            Assert.assertTrue(mathActions.multiply(  2,  2)==4);
            Assert.assertTrue(mathActions.multiply(  2,  3)==6);
            Assert.assertTrue(mathActions.multiply(  2,  5)==10);
            Assert.assertTrue(mathActions.multiply(  3,  3)==9);

        }
}

