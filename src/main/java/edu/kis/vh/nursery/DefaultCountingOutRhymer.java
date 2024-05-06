package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_CAPACITY = 12;
    public static final int FULL_INDEX = 11;
    public static final int EMPTY_INDEX = -1;
    private int[] numbers = new int[NUMBERS_CAPACITY];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
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
