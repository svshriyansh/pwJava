package DSA.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.poll();
        }
        queue1.add(x);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.peek());
            queue2.poll();
        }

    }

    public int pop() {
        int val = queue1.peek();
        queue1.poll();
        return val;
    }

    public int top() {
        return 1;
    }

    public boolean isEmpty() {
        if (!queue2.isEmpty() || !queue1.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MyStack stackobj = new MyStack();
        stackobj.push(4);
        stackobj.push(5);
        stackobj.push(9);
        stackobj.push(3);
        stackobj.push(2);
        int val = stackobj.pop();

        System.out.println("Stack is " + val);
    }
}
