package DSA.Stack;

import java.util.Stack;

/*
 * !
 ! I need to check the value and put their index vaue in the particular array
 */
public class largestHistogram {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] previousMin = new int[heights.length];
        int[] nextMin = new int[heights.length];
        int Area = 0;

        // creating the previous minimum element array;
        // for doing so we are maintaining a stack in which we will be able to get the
        // minimum element
        for (int i = 0; i < heights.length; i++) {
            // if stack is empty is empty push -1 in array
            if (stack.empty()) {
                previousMin[i] = -1;
                stack.push(i);// !pushing the index if array
            }
            // check for smaller element in stack
            else {
                while (!stack.empty()) {
                    if (heights[i] > heights[stack.peek()]) {
                        previousMin[i] = stack.peek();
                        break;
                    } else {
                        stack.pop();
                        previousMin[i] = -1;
                    }
                }
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            stack.pop();
        }
        // creating the mext minimum using stack
        for (int i = heights.length - 1; i >= 0; i--) {
            // if stack is empty is empty push -1 in array
            if (stack.empty()) {
                nextMin[i] = heights.length;
                stack.push(i);
            }
            // check for smaller element in stack
            else {
                while (!stack.empty()) {
                    if (heights[i] > heights[stack.peek()]) {
                        nextMin[i] = stack.peek();
                        break;
                    } else {
                        stack.pop();
                        nextMin[i] = heights.length;
                    }
                }
            }
            stack.push(i);
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = (nextMin[i] - previousMin[i]) - 1;
            Area = width * heights[i];
            if (Area > max) {
                max = Area;
            }
        }
        System.out.println("Next minimum");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(nextMin[i] + " ");
        }
        System.out.println("\nPrevious minimum");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(previousMin[i] + " ");
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] heights = { 2, 1, 5, 6, 2, 3 };
        int[] heights = { 2, 4 };
        int ans = largestRectangleArea(heights);
        System.out.println("\n" + ans);

    }
}
