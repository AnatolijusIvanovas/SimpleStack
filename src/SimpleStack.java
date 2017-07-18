/**
 * Created by Anatolijus on 2017-07-17.
 */
public class SimpleStack {

    int stackSize;
    int[] stackArray;
    int top;

    public SimpleStack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = new int[stackSize];
        this.top = -1;
    }

    public void addElement(int element) {
        stackArray[++top] = element;
    }

    public void removeElement() {
        top--;
    }

    public int readElement() {
        return stackArray[top];
    }
}