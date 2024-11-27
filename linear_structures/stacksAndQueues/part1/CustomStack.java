package linear_structures.stacksAndQueues.part1;

public class CustomStack {
    protected int[] data;
    private static final int default_size = 10;

    int ptr = -1;

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new StackException("Cannot pop from empty stack");
        }
        int removedItem = data[ptr];
        ptr--;
        return removedItem;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new StackException("Cannot peek to empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack() {
        this(default_size);
    }
}
