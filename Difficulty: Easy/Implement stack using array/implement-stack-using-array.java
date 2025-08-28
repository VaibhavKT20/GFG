class MyStack {
    int arr[];
    int top;
    int cap;
    

    MyStack() {
        this(100); 
    }
    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    public void push(int x) {
        if (top == cap - 1) {
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        return arr[top--];
    }
}
