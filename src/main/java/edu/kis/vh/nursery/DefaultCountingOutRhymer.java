package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT_RETURN = -1;

    public static final int MAX_SIZE = 12;
    public static final int ARRAY_FULL = MAX_SIZE - 1;
    public static final int TOTAL_DEFAULT_VALUE = -1;
    public static final int CALL_CHECK_VALUE = -1;
    private int[] numbers = new int[MAX_SIZE];

    public int total = TOTAL_DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CALL_CHECK_VALUE;
    }
        
    public boolean isFull() {
        return total == ARRAY_FULL;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total];
    }
            
    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total--];
    }

}
