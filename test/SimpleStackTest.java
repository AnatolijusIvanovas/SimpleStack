import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Anatolijus on 2017-07-17.
 */
public class SimpleStackTest {

    SimpleStack stack = new SimpleStack(25);

    @Test public void stackHasMaximimSize() {
        assertEquals(25, stack.stackSize);
    }

    @Test public void stackHasArrayWithMaximimSize() {
        assertEquals(25, stack.stackArray.length);
    }

    @Test public void stackTopPointedToTopElenentInArray() {
        assertEquals(-1, stack.top);
    }

    @Test public void canAddElementToStack() {
        stack.addElement(123);
        assertEquals(123, stack.stackArray[stack.top]);
    }

}