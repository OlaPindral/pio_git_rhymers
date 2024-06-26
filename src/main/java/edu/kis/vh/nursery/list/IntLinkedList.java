package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_INDEX = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return EMPTY_INDEX;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_INDEX;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
