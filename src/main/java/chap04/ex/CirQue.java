package chap04.ex;

public class CirQue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyCirQueException extends RuntimeException {
        public EmptyCirQueException() {

        }
    }

    public class OverflowQueException extends RuntimeException {
        public OverflowQueException() {

        }
    }

    public CirQue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError error) {
            max = 0;
        }
    }

}
