package DSA.Stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(9);
        stack.push(19);
        stack.push(29);

        System.out.println("Stack is " + stack);
        System.out.println("Top most element in stack before deletion is " + stack.peek());
        stack.pop();
        System.out.println("Stack after pop " + stack);
        System.out.println("Top most element in stack before deletion is " + stack.peek());
        System.out.println("Element 2 is present at position " + stack.search(2));
    }
}
