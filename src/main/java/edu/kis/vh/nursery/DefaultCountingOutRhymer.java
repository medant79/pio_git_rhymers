package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int errorValue = -1;
    public static final int size = 12;
    private int[] numbers = new int[size];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == errorValue;
    }
        
    public boolean isFull() {
        return total == 11;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return errorValue;
        return numbers[total];
    }
            
    public int countOut() {
        if (callCheck())
            return errorValue;
        return numbers[total--];
    }

}
