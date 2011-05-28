package item23.generics;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 12:40:12 PM
 */
public class StackTest {

    @Test
    public void shouldPushAndPopNotTypeSafeElements(){
        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push(1);

        assertEquals(1,stack.pop());
        assertEquals("d",((String)stack.pop()).toLowerCase());
        assertEquals("c",((String)stack.pop()).toLowerCase());
        assertEquals("b",((String)stack.pop()).toLowerCase());
        assertEquals("a",((String)stack.pop()).toLowerCase());
    }

    @Test(expected = RuntimeException.class)
    public void shouldCreateStringStack(){
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        assertEquals("d",stack.pop().toLowerCase());
        assertEquals("c",stack.pop().toLowerCase());
        assertEquals("b",stack.pop().toLowerCase());
        assertEquals("a",stack.pop().toLowerCase());

        stack.pop();
    }
}
