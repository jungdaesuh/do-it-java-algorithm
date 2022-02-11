package chap04;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    // 실행 시 예외: 스택이 비어 있음.
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {

        }
    }

    // 실행 시 예외: 스택이 가득 참.
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {

        }

    }

    // 생성자
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];            // 스택 본체용 배열 생성
        } catch (OutOfMemoryError error) { // 생성할 수 없음.
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝 (정상에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크 (정상에 있는 데이터를 들여다봄)
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    // 스택에서 x를 찾아 인덱스를 반환, 없으면 -1를 반환
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) { // 정상 쪽에서 선형 검색
            if (stk[i] == max) {             // 검색 성공
                return i;                    // 검색 실패
            }
        }
        return -1;
    }

    // 스택 비우기
    public void clear() {
        ptr = 0;
    }

    // 스택의 용량 확인
    public int capacity() {
        return max;
    }

    // 현재 스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어 있는지 확인, 스택이 비어 있으면 true, 그렇지 않으면 false
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찾는지 확인
    public boolean isFull() {
        return ptr >= max;
    }

    // 스택 안의 모든 데이터를 바닥에서 꼭대기까지 순서대로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = 0; i < stk.length; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }

    }
}
