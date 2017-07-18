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

    @Test public void canRemoveElement() {
        stack.addElement(123);
        stack.removeElement();
        assertEquals(-1, stack.top);
    }

    @Test public void canReadTopElement() {
        stack.addElement(12345);
        assertEquals(12345, stack.readElement());
    }

    @Test public void canCheckIfStackIsEmpty() {
        assertEquals(true, stack.isEmpty());
        stack.addElement(42);
        assertEquals(false, stack.isEmpty());
    }

    @Test public void canCheckIfStackIsFull() {
        assertEquals(false, stack.isFull());
        for (int i = 0; i < 25; i++) {
            stack.addElement(i);
        }
        assertEquals(true, stack.isFull());
    }

}