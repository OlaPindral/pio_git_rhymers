package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_CAPACITY = 12;
    private static final int FULL_INDEX = 11;
    private static final int EMPTY_INDEX = -1;
    private final int[] numbers = new int[NUMBERS_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_INDEX;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    protected boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total--];
    }

}
