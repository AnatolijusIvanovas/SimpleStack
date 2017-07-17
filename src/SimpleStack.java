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

}