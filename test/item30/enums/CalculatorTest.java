package item30.enums;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 4:34:18 PM
 */
public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers(){
        double result = Calculator.Operations.ADD.apply(1,2);
        Assert.assertEquals(3,result,0);
    }

    @Test
    public void shouldSubtractTwoNumbers(){
        double result = Calculator.Operations.SUBTRACT.apply(4,2);
        Assert.assertEquals(2,result,0);
    }
}
