package chap04.ex;

import chap04.IntStack;

public class IntAryQueue_04_04 {
    private int max;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {

        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {

        }
    }

    public IntAryQueue_04_04(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError error) {
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max)
            throw new OverflowIntQueueException();
        que[num++] = x;
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        int x = que[0];
        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];
        num--;
        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        return que[num - 1];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++)
            if (que[i] == x)
                return i;
        return -1;
    }




}
